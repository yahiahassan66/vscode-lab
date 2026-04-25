package org.example;

public class App {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Sum: " + c.add(10, 5));
        System.out.println("Multiply: " + c.multiply(10, 5));
        System.out.println("Subtract: " + c.subtract(10, 5));
        System.out.println("Divide: " + c.divide(10, 5));
        System.out.println("Reverse: " + c.reverse("Gradle"));
    }
}