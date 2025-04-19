 interface Add {
     public int add(int a, int b);
    static void show() {
        System.out.println("Default method");
    }
}
 interface Sub extends Add {
    public int sub(int a, int b);
}

class calc implements Sub {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
}
class interfaceDemo {
    public static void main(String[] args) {
        Add obj = new calc();
        System.out.println(obj.add(3, 4));
        System.out.println(((Sub) obj).sub(3, 4));
        Add.show();
        // obj.show();
    }
}

