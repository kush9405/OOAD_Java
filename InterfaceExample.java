/* Interface extending another Interface */
// Parent Interface
interface Animal {
    void eat();
    void sleep();
}

// Child Interface extending Animal
interface Dog extends Animal {
    void bark();  // Additional method for Dog
}

// Concrete class implementing Dog interface
class GermanShepherd implements Dog {
    public void eat() {
        System.out.println("German Shepherd is eating.");
    }
    
    public void sleep() {
        System.out.println("German Shepherd is sleeping.");
    }
    
    public void bark() {
        System.out.println("German Shepherd is barking.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog myDog = new GermanShepherd();
        myDog.eat();   // Inherited from Animal
        myDog.sleep(); // Inherited from Animal
        myDog.bark();  // Defined in Dog interface
    }
}
