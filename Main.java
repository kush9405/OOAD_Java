abstract class Figure {
    double a;
    double b;

    Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    abstract double findArea();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }
    @Override
    double findArea() {
        return a * b;
    }
}

class Triangle extends Figure {
    double c;

    Triangle(double a, double b,double c) {
        super(a, b);
        this.c = c;
    }
    @Override
    double findArea() {
        double s= (a+b+c)/2;
        return s*(s-a)*(s-b)*(s-c);
    }
}

public class Main {
    
    public static void main(String[] args) {
        Figure f = new Rectangle(10, 20);
        System.out.println("Area of rectangle: " + f.findArea());
        Figure d = new Triangle(10, 30,30);
        System.out.println("Area of triangle: " + d.findArea());
    }
}