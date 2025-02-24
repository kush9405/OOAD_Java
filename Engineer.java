public class Engineer {
    String name;
    int experience;

    Engineer(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    void display() {
        System.out.println("Name: " + name + " Experience: " + experience);
    }

}