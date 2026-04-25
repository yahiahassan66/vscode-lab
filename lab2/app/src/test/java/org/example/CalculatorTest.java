package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    void testAdd() {
        assertEquals(15, c.add(10, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(50, c.multiply(10, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(5, c.subtract(10, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, c.divide(10, 5));
    }

    @Test
void testReverse() {
    assertEquals("eldarG", c.reverse("Gradle"));
}
}