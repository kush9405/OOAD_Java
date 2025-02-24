import java.util.Scanner;

public class Boxdemo {
    double height, width, depth;

    Boxdemo() {
        height = 10;
        width = 10;
        depth = 10;
    }
    Boxdemo(double h, double w) {
        height = h;
        width = w;
        depth = 10.0;
    }
    Boxdemo(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }
    void setDim(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    void display() {
        System.out.println("This is display method height: " + height + " width: " + width + " depth: " + depth);
    }

    void volume(double h, double w, double d) {
        System.out.println("Volume is: " + h * w * d);
    }
    public static void main(String[] args) {
        Boxdemo b1 = new Boxdemo();
        Scanner sc = new Scanner(System.in);
        int h =sc.nextInt() ;
        int w =sc.nextInt() ;
        int d =sc.nextInt() ;
        // b1.setDim(h, w, d);
        b1.volume(h, w, d);
        b1.display();
        sc.close();
    }
}
