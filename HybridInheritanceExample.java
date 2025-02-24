// Base class 1
class Engineer {
    String name;

    Engineer(String name) {
        this.name = name;
    }

    void work() {
        System.out.println(name + " is working as a general engineer.");
    }
}

// Interface 1
interface SoftwareEngineer {
    void code(); // Abstract method to be implemented by the derived class
}

// Interface 2
interface CivilEngineer {
    void manageProject(); // Abstract method to be implemented by the derived class
}

// Derived class implementing multiple interfaces and inheriting from Engineer class
class MultiSkilledEngineer extends Engineer implements SoftwareEngineer, CivilEngineer {
    String programmingLanguage;
    String projectType;

    MultiSkilledEngineer(String name, String programmingLanguage, String projectType) {
        super(name);
        this.programmingLanguage = programmingLanguage;
        this.projectType = projectType;
    }

    @Override
    public void code() {
        System.out.println(name + " is coding in " + programmingLanguage + ".");
    }

    @Override
    public void manageProject() {
        System.out.println(name + " is managing a " + projectType + " project.");
    }
}

// Main class to test the hybrid inheritance
public class HybridInheritanceExample {
    public static void main(String[] args) {
        // Create instance of MultiSkilledEngineer
        MultiSkilledEngineer engineer = new MultiSkilledEngineer("Ram", "Java", "Bridge");

        // Call methods from base class and interfaces
        engineer.work(); // From Engineer class
        engineer.code(); // From SoftwareEngineer interface
        engineer.manageProject(); // From CivilEngineer interface
    }
}
