interface Animal {
    void makeSound(); // Abstract method
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks!");
    }
}

public class BasicInterface {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // Output: Dog barks!
    }
}
