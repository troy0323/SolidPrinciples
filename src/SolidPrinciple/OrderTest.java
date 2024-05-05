package SolidPrinciple;

public class Main {
    public static void main(String[] args) {
        OrderAction order = new OrderAction(new TotalCalculator(), new OrderPlacerImpl(), new InvoiceGeneratorImpl(), new EmailNotifierImpl());
        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");
        order.generateInvoice("order_123.pdf");
        order.sendEmailNotification("johndoe@example.com");
    }
}