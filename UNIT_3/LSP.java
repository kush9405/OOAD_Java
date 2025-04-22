// Base class representing a general Bird
class Bird {
    public void eat() {
        System.out.println("This bird is eating.");
    }
}

// Interface representing the ability to fly
interface Flyable {
    void fly();
}

// Subclass representing Duck, which can fly
class Duck extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("The duck is flying.");
    }
}

// Subclass representing Penguin, which cannot fly, so it doesn't implement Flyable
class Penguin extends Bird {
    // Penguins cannot fly, so no fly() method here
    public void swim() {
        System.out.println("The penguin is swimming.");
    }
}

public class LSP {
    public static void main(String[] args) {
        Bird bird1 = new Duck();
        bird1.eat();
        if (bird1 instanceof Flyable) {
            ((Flyable) bird1).fly(); // Only call fly if the bird can fly
        }

        Bird bird2 = new Penguin();
        bird2.eat();
        // No fly method for penguin, so no error here
        if (bird2 instanceof Penguin) {
            ((Penguin) bird2).swim(); // Penguins swim instead of flying
        }
    }
}
