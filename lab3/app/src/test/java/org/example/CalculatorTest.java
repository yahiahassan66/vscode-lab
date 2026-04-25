package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
void testCalculate() {
    Calculator c = new Calculator();

    double result = c.calculateResult(10, 5);

    assertEquals(0.3, result, 0.0001);
}
}