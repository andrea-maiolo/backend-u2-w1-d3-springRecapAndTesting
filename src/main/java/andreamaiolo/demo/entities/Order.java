package andreamaiolo.demo.entities;

import andreamaiolo.demo.enums.OrderStatus;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int orderIdCounter = 1;
    private Table table;
    private int numSeats;
    private OrderStatus status;
    private int startHour;
    private int orderId;
    private double totalBill;
    private double coperto;
    private List<Food> completeOrder;

    public Order(Table table, int numSeats, double coperto) {
        this.numSeats = numSeats;
        this.table = table;
        this.orderId = orderIdCounter;
        orderIdCounter += 1;
        this.startHour = 20;
        this.status = OrderStatus.INPROGRESS;
        this.completeOrder = new ArrayList<>();
        this.coperto = coperto;
    }

    public void addToOrder(Food itemToAdd) {
        completeOrder.add(itemToAdd);
        getTotalBill();
    }

    public void getTotalBill() {
        double totalCoperti = this.coperto * this.numSeats;
        double totalItems = this.completeOrder.stream()
                .mapToDouble(f -> f.getPrice())
                .sum();
        this.totalBill = totalCoperti + totalItems;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderIdCounter() {
        return orderIdCounter;
    }

    public void setOrderIdCounter(int orderIdCounter) {
        this.orderIdCounter = orderIdCounter;
    }

    public double getCoperto() {
        return coperto;
    }

    public void setCoperto(double coperto) {
        this.coperto = coperto;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public List<Food> getCompleteOrder() {
        return completeOrder;
    }

    public void setCompleteOrder(List<Food> completeOrder) {
        this.completeOrder = completeOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "table=" + table +
                ", numSeats=" + numSeats +
                ", status=" + status +
                ", startHour=" + startHour +
                ", orderId=" + orderId +
                ", orderIdCounter=" + orderIdCounter +
                ", totalBill=" + totalBill +
                ", coperto=" + coperto +
                ", completeOrder=" + completeOrder +
                '}';
    }
}
