package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;

public class OrderProcessorTest {

    @Test
    void testOrderSummary() {

        Customer c = new Customer("Ali", true);

        Order order = new Order(c, List.of(
                new Item("Book", 10, 2),
                new Item("Pen", 2, 5)
        ));

        OrderProcessor op = new OrderProcessor();

        op.printOrderSummary(order);

        // فقط للتأكد أنه لا يوجد error
        assert true;
    }
}