// Creator pattern
import java.util.List;

// Represents a customer
class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Represents a product
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Represents an order
class Order {
    private Customer customer;
    private List<Product> products;

    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }
}

// Represents the repository to save orders
class OrderRepository {
    public void saveOrder(Order order) {
        System.out.println("Order saved for customer: " + order.getCustomer().getName() +
                " with products: " + order.getProducts().stream().map(Product::getName).toList());
    }
}

public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void createOrder(Customer customer, List<Product> products) {
        // |/ Create a new order object
        Order order = new Order(customer, products);
        // I/ Save the order to the repository
        orderRepository.saveOrder(order);
    }
}