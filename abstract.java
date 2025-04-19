abstract class A {
    abstract void meth();

    void meth1() {
        System.out.println("This is a concrete method.");
    }
}
class B extends A {
    void meth() {
        System.out.println("This is an abstract method.");
    }
}

class abdemo {
    public static void main(String args[]) {
        A a;
        a=new B();
        a.meth();
        a.meth1();
    }
}