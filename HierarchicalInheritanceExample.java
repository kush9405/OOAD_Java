// Base class
class Engineer {
    String name;

    Engineer(String name) {
        this.name = name;
    }

    void work() {
        System.out.println(name + " is working as a general engineer.");
    }
}

// Derived class 1: Software Engineer
class SoftwareEngineer extends Engineer {
    String programmingLanguage;

    SoftwareEngineer(String name, String programmingLanguage) {
        super(name);
        this.programmingLanguage = programmingLanguage;
    }

    void code() {
        System.out.println(name + " is coding in " + programmingLanguage + ".");
    }
}

// Derived class 2: Civil Engineer
class CivilEngineer extends Engineer {
    String projectType;

    CivilEngineer(String name, String projectType) {
        super(name);
        this.projectType = projectType;
    }

    void manageProject() {
        System.out.println(name + " is managing a " + projectType + " project.");
    }
}

// Main class to test the hierarchy
public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        // Create instances of the derived classes
        SoftwareEngineer softwareEngineer = new SoftwareEngineer("Ram", "Java");
        CivilEngineer civilEngineer = new CivilEngineer("Krishna", "Building");

        // Call methods from the base class and derived classes
        softwareEngineer.work(); // From Engineer
        softwareEngineer.code(); // From SoftwareEngineer
        civilEngineer.work(); // From Engineer
        civilEngineer.manageProject(); // From CivilEngineer
    }
}
