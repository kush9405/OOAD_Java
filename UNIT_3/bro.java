public class bro {
    int arr[] = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        bro obj = new bro();
        for (int num : obj.arr) { // Using enhanced for-each  loop
            System.out.println(num);
        }
    }
}
