package andreamaiolo.demo.entities;

import andreamaiolo.demo.enums.TableStatus;

public class Table {
    private int tableNumber;
    private int maxSeats;
    private TableStatus status;

    public Table(int tableNumber, int maxSeats) {
        this.maxSeats = maxSeats;
        this.tableNumber = tableNumber;
        this.status = TableStatus.AVAILABLE;
    }

    public TableStatus getStatus() {
        return status;
    }

    public void setStatus(TableStatus status) {
        this.status = status;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableNumber=" + tableNumber +
                ", maxSeats=" + maxSeats +
                ", status=" + status +
                '}';
    }
}
