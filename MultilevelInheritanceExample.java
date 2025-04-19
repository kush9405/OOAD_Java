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

// Derived class
class SoftwareEngineer extends Engineer {
    String programmingLanguage;

    SoftwareEngineer(String name, String programmingLanguage) {
        super(name); // Call the constructor of the base class
        this.programmingLanguage = programmingLanguage;
    }

    void code() {
        System.out.println(name + " is coding in " + programmingLanguage + ".");
    }
}

// Further derived class
class FullStackEngineer extends SoftwareEngineer {
    String framework;

    FullStackEngineer(String name, String programmingLanguage, String framework) {
        super(name, programmingLanguage); // Call the constructor of the parent class
        this.framework = framework;
    }

    void designFrontend() {
        System.out.println(name + " is designing a frontend using " + framework + ".");
    }

    void manageBackend() {
        System.out.println(name + " is managing the backend in " + programmingLanguage + ".");
    }
}

// Main class
public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        // Create an instance of FullStackEngineer
        FullStackEngineer engineer = new FullStackEngineer("Ram", "Java", "React");

        // Call methods from all levels of the hierarchy
        engineer.work(); // From Engineer
        engineer.code(); // From SoftwareEngineer
        engineer.designFrontend(); // From FullStackEngineer
        engineer.manageBackend(); // From FullStackEngineer
    }
}
