import java.util.List;

public class Order {
    private Customer customer;
    private List<Product> products;

    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order for " + customer.getName() + " with " + products.size() + " products.";
    }
}