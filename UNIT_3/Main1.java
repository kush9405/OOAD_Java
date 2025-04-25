import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a repository
        OrderRepository orderRepository = new OrderRepository();

        // Create an order service
        OrderService orderService = new OrderService(orderRepository);

        // Create a customer
        Customer customer = new Customer("John Doe");

        // Create some products
        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Mouse", 50);

        // Place an order
        orderService.createOrder(customer, Arrays.asList(product1, product2));
    }
}