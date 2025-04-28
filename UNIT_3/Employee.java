public class Employee {
    private final String name;
    private final String role;
    private final String assignment;
    public Employee(String name, String role, String assignment) {
        this.name = name;
        this.role = role;
        this.assignment = assignment;
    }
    public void printCurrentAssignment(){
        Printer printer = Printer.getInstance();
        printer.print("Employee: " + name + "\n" +
                "Role: " + role + "\n" +
                "Assignment: " + assignment + "\n");
    }
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "Software Engineer", "Project A");
        Employee employee1 = new Employee("Jessica", "Software Engineer", "Project B");
        employee.printCurrentAssignment();
        employee1.printCurrentAssignment();
    }
}
