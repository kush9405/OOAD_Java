// Base class for common properties of Engineers
class Engineer {
    String name;

    Engineer(String name) {
        this.name = name;
    }

    void work() {
        System.out.println(name + " is working as an engineer.");
    }
}

// Interface for Software Engineers
interface SoftwareEngineer {
    void writeCode(); // Abstract method
}

// Interface for Civil Engineers
interface CivilEngineer {
    void designBuildings(); // Abstract method
}

// Class that inherits from Engineer and implements multiple interfaces
class MultiSkilledEngineer extends Engineer implements SoftwareEngineer, CivilEngineer {

    MultiSkilledEngineer(String name) {
        super(name);
    }

    // Implement methods from SoftwareEngineer
    public void writeCode() {
        System.out.println(name + " is writing code for software development.");
    }

    // Implement methods from CivilEngineer
    public void designBuildings() {
        System.out.println(name + " is designing buildings and infrastructure.");
    }
}

// MultipleInheritance2 class to test the example
public class MultipleInheritance2 {
    public static void main(String[] args) {
        // Create an instance of MultiSkilledEngineer
        MultiSkilledEngineer engineer = new MultiSkilledEngineer("Ram");

        // Call methods from base class and interfaces
        engineer.work();             // From Engineer class
        engineer.writeCode();        // From SoftwareEngineer interface
        engineer.designBuildings();  // From CivilEngineer interface
    }
}
