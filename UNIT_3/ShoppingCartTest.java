public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("Apple", 0.99));
        cart.addItem(new Item("Banana", 0.59));
        cart.addItem(new Item("Orange", 0.79));

        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total Price: $" + totalPrice);
    }
}