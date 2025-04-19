class MainOverloadExample {

    // Standard main method called by JVM
    public static void main(String[] args) {
        System.out.println("Standard main method");

        // Calling overloaded main methods explicitly
        main(10);
        main("Hello");
        main(5.5, 2.2);
    }

    // Overloaded main method with an int parameter
    public static void main(int a) {
        System.out.println("Overloaded main with int: " + a);
    }

    // Overloaded main method with a String parameter
    public static void main(String str) {
        System.out.println("Overloaded main with String: " + str);
    }

    // Overloaded main method with two double parameters
    public static void main(double a, double b) {
        System.out.println("Overloaded main with doubles: " + (a + b));
    }
}
