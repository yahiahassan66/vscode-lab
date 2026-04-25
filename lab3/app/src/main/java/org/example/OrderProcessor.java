package org.example;

public class OrderProcessor {

    public void printOrderSummary(Order order) {

        double total = calculateTotal(order);
        total = applyDiscount(order, total);

        printSummary(order, total);
    }

    // Extract Method 1
    private double calculateTotal(Order order) {
        double total = 0;

        for (Item item : order.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }

        return total;
    }

    // Extract Method 2
    private double applyDiscount(Order order, double total) {
        if (order.getCustomer().isMember()) {
            return total * 0.9;
        }
        return total;
    }

    // Extract Method 3
    private void printSummary(Order order, double total) {
        System.out.println("Order Summary:");
        System.out.println("Customer: " + order.getCustomer().getName());

        for (Item item : order.getItems()) {
            System.out.println("- " + item.getName()
                    + " x " + item.getQuantity()
                    + " = " + item.getPrice() * item.getQuantity());
        }

        System.out.println("Total: " + total);
    }
}