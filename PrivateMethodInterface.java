interface Animal {
    private void log(String message) {
        System.out.println("Log: " + message);
    }

    default void sleep() {
        log("bhaisaab..."); // Private method used here
        System.out.println("Animal is sleeping.");
    }
}

class Dog implements Animal {}

public class PrivateMethodInterface {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sleep(); // Output: Log: Sleeping...  Animal is sleeping.
    }
}
