// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Main
{
    // Method to add two integers
    int add(int a, int b) {
System.out.println("int,int");
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    String add(String a, String b) {
        return a + b;
    }
double add(int a, double b)
{
System.out.println("int,double");

return (a+b);
}


    public static void main(String[] args) {
        Main obj = new Main();

        // Calling overloaded methods
        System.out.println("Sum of two integers: " + obj.add(5.0, 10));
        System.out.println("Sum of three integers: " + obj.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + obj.add(5.5, 10.5));
        System.out.println("Concatenation of two strings: " + obj.add("Hello, ", "World!"));
    }
}

