public class OrderService {

private final OrderRepository orderRepository; // instance variable for OrderRepository
// Constructor to initialize the OrderRepository
// This constructor is used to inject the OrderRepository dependency
// into the OrderService class
// This is a common practice in dependency injection
// frameworks like Spring, where the framework manages the lifecycle
// of the dependencies and injects them into the classes that need them
// This allows for better separation of concerns and makes the code
// more testable and maintainable
// The constructor takes an OrderRepository object as a parameter
// and assigns it to the instance variable orderRepository
// This allows the OrderService class to use the methods of the
// OrderRepository class to perform operations related to orders
// The constructor is public, which means it can be accessed
// from outside the class
// This allows other classes to create an instance of OrderService
// and pass an OrderRepository object to it
// This is useful for testing purposes, as it allows us to
// pass a mock or stub implementation of OrderRepository
// to the OrderService class, making it easier to test
// the OrderService class in isolation


public OrderService(OrderRepository orderRepository) {
this.orderRepository = orderRepository;
}

public void createOrder(Customer customer, List<Product> products) {
// Create a new order object
Order order = new Order(customer, products);

// Save the order to the repository
orderRepository.saveOrder(order);
}
}