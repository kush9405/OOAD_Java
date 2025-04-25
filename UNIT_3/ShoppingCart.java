import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void addItem(String name, double price) {
        Item item = new Item(name,price); // ShoppingCart creates the Item
        items.add(item);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
    public void showItems() {
        for (Item item : items) {
            System.out.println("Item: " + item.getName() + ", Price: " + item.getPrice());
        }
    }
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 999.99);
        cart.addItem("Mouse", 25.50);
        cart.showItems();
        System.out.println("Total Price: " + cart.calculateTotalPrice());
    }
}