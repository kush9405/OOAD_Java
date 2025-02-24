interface Animal {
    void makeSound(); // Abstract method

    default void eat() {
        System.out.println("Eating...");
    }

    static void description() {
        System.out.println("This is an Animal interface.");
    }
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks!");
    }
}

public class DefaultStaticInterface {
    public static void main(String[] args) {
        Animal.description(); // Static method
        Animal dog = new Dog();
        dog.makeSound();
        dog.eat(); // Default method
        // dog.description(); // Static method can not be called with instance
    }
}
