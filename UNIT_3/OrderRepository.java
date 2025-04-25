import java.util.List;

public class OrderRepository {
    public void saveOrder(Order order) {
        System.out.println("Order saved for customer: " + order.getCustomer().getName() +
                " with products: " + order.getProducts().stream().map(Product::getName).toList());
    }
}
