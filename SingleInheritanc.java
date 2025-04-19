
class SoftwareEngineer extends Engineer {
    String language;

    SoftwareEngineer(String name, int experience, String language) {
        super(name, experience);
        this.language = language;
    }

    void display() {
        super.display();
        System.out.println("Language: " + language);
    }
}
public class SingleInheritanc {
    public static void main(String[] args) {
        SoftwareEngineer se = new SoftwareEngineer("John", 5, "Kotlin");
        se.display();
    }
}