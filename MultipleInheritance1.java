// Base class for common engineer properties
class Engineer {
    String name;

    Engineer(String name) {
        this.name = name;
    }

    void work() {
        System.out.println(name + " is working as a general engineer.");
    }
}

// Interface for Software Engineers
interface SoftwareEngineer {
    void code(); // Abstract method to define coding behavior
}

// Derived class inheriting from Engineer and implementing SoftwareEngineer
class MultiSkilledEngineer extends Engineer implements SoftwareEngineer {

    String programmingLanguage;

    MultiSkilledEngineer(String name, String programmingLanguage) {
        super(name); // Call the constructor of the Engineer class
        this.programmingLanguage = programmingLanguage;
    }

    // Implement the code() method from SoftwareEngineer interface
    public void code() {
        System.out.println(name + " is coding in " + programmingLanguage + ".");
    }
}

// MultipleInheritance1 class to test the example
public class MultipleInheritance1 {
    public static void main(String[] args) {
        // Create an instance of MultiSkilledEngineer
        MultiSkilledEngineer engineer = new MultiSkilledEngineer("Ram", "Java");

        // Call methods from both the base class and the interface
        engineer.work();  // From Engineer class
        engineer.code();  // From SoftwareEngineer interface
    }
}
