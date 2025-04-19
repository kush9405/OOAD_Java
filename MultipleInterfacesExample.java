/* A class implementing multiple interfaces */
// General animal behavior
interface Animal {
    void eat();
}

// Interface for swimming animals
interface Swimmer {
    void swim();
}

// Interface for running animals
interface Runner {
    void run();
}

// Dog implements multiple interfaces
class Dog implements Animal, Swimmer, Runner {
    public void eat() {
        System.out.println("Dog is eating.");
    }
    
    public void swim() {
        System.out.println("Dog is swimming.");
    }
    
    public void run() {
        System.out.println("Dog is running.");
    }
}

public class MultipleInterfacesExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // From Animal interface
        myDog.swim(); // From Swimmer interface
        myDog.run();  // From Runner interface
    }
}
