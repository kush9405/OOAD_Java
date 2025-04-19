class Employee {
    int id;
    String name;
    double salary;

    // Default constructor
    Employee() {
        this.id = 0;
        this.name = "Not Assigned";
        this.salary = 0.0;
    }

    // Constructor with one parameter (id only)
    Employee(int id) {
        this.id = id;
        this.name = "Not Assigned";
        this.salary = 0.0;
    }

    // Constructor with two parameters (id and name)
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 30000.0;  // Default salary
    }

    // Constructor with three parameters (id, name, and salary)
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Employee emp1 = new Employee();  // Calls default constructor
        Employee emp2 = new Employee(101);  // Calls constructor with one parameter
        Employee emp3 = new Employee(102, "Alice");  // Calls constructor with two parameters
        Employee emp4 = new Employee(103, "Bob", 50000.0);  // Calls constructor with three parameters

        // Displaying employee details
        emp1.display();
        emp2.display();
        emp3.display();
        emp4.display();
    }
}
