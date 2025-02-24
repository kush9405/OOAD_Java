// Abstract Class
abstract class Payment {
    private double amount;

    // Constructor
    public Payment(double amount) {
        this.amount = amount;
    }

    // Concrete Method
    public double getAmount() {
        return amount;
    }

    // Abstract Method
    abstract void processPayment(); // Each payment method must implement this
}

// Subclass: CreditCardPayment
class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        System.out.println("Processing credit card payment of $" + getAmount() + " using card: " + cardNumber);
    }
}

// Subclass: PayPalPayment
class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    void processPayment() {
        System.out.println("Processing PayPal payment of $" + getAmount() + " for email: " + email);
    }
}

// Subclass: BankTransferPayment
class BankTransferPayment extends Payment {
    private String bankAccount;

    public BankTransferPayment(double amount, String bankAccount) {
        super(amount);
        this.bankAccount = bankAccount;
    }

    @Override
    void processPayment() {
        System.out.println("Processing bank transfer payment of $" + getAmount() + " to account: " + bankAccount);
    }
}

// Main Class
public class PaymentSystem {
    public static void main(String[] args) {
        // Create instances of different payment types
        Payment creditCardPayment = new CreditCardPayment(100.0, "1234-5678-9876-5432");
        Payment payPalPayment = new PayPalPayment(200.0, "user@example.com");
        Payment bankTransferPayment = new BankTransferPayment(300.0, "9876543210");

        // Process each payment
        creditCardPayment.processPayment();
        payPalPayment.processPayment();
        bankTransferPayment.processPayment();
    }
}
