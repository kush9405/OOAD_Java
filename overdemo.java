public class overdemo {

    int add(int a) {
        return a;
    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }
    double add(int a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        overdemo o = new overdemo();
        System.out.println(o.add(10));
        System.out.println(o.add(10, 20));
        System.out.println(o.add(10, 20, 30));
        System.out.println(o.add(20.0, 20.0));
        System.out.println(o.add(10, 20.0));
        System.out.println(o.add(10.0, 20.0));
    }
}
