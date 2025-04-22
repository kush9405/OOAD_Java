//Separate smaller interfaces based on specific behaviors

interface IFlyable {
    void fly();
}

interface IWalkable {
    void walk();
}

interface ISwimmable {
    void swim();
}

// Sparrow class implements only what it needs
class Sparrow implements IFlyable, IWalkable {
    public void fly() {
        System.out.println("Sparrow is flying.");
    }

    public void walk() {
        System.out.println("Sparrow is walking.");
    }
}

// Penguin class implements only what it needs
class Penguin implements IWalkable, ISwimmable {
    public void walk() {
        System.out.println("Penguin is walking.");
    }

    public void swim() {
        System.out.println("Penguin is swimming.");
    }
}

public class Isp {
    public static void main(String[] args) {
        IFlyable sparrow = new Sparrow();
        sparrow.fly();
		((IWalkable) sparrow).walk();

        IWalkable penguin = new Penguin();
        penguin.walk();
        ((ISwimmable) penguin).swim();  // Cast to ISwimmable for swimming, penguin is an instance of the Penguin class, which implements both IWalkable and ISwimmable interfaces.
    }
}
