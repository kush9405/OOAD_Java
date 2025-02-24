// Parent Class (Superclass)
class Animal {
    // Method in the parent class
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class (Subclass)
class Dog extends Animal {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();  // Output: Animal makes a sound
        
        Dog dog = new Dog();
        dog.sound();  // Output: Dog barks
        
        // Demonstrating runtime polymorphism
        Animal ref = new Dog();
        ref.sound();  // Output: Dog barks
    }
}
