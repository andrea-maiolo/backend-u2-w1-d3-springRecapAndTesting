package andreamaiolo.demo;

import andreamaiolo.demo.entities.Menu;
import andreamaiolo.demo.entities.Pizzas;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringrecapApplicationTests {
    private final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringrecapApplication.class);

    @Test
    void contextLoads() {
    }

    @Test
    void testDivision() {
        int a = 15;
        int b = 5;
        int result = a / b;
        assertEquals(3, result, "Should be 3");
    }

    @Test
    void testExceptionThrown() {
        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        });
    }

    @Test
    void testPizzaMargheritaIsOnMenu() {
        Pizzas marghe = ctx.getBean("getMargherita", Pizzas.class);
        Menu menu = ctx.getBean(Menu.class);
        assertTrue(menu.getAllPizzas().contains(marghe));
    }

    @Test
    void testPriceHamMushrooms() {
        Pizzas hm = ctx.getBean("getHamMushrooms", Pizzas.class);
        double checkPrice = hm.getPrice();
        double result = 8.1;
        assertEquals(result, checkPrice, "should be the same");
    }


    @Test
    void closeCtx() {
        ctx.close();
    }
}
