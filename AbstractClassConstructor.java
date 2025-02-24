abstract class Base{
    int a;
    Base(int a1){
        a=a1;
        System.out.println("I'm abstract class contructor: a value is "+a);
    }    
    Base(){
        System.out.println("I'm abstract class default contructor");
    }
}
class Derived extends Base{
    Derived(int b){
        super(b);
        System.out.println("I'm derived class contructor");
    }  
    Derived(){
        System.out.println("I'm derived class default contructor");
    }
}
public class AbstractClassConstructor {
    public static void main(String[] args){
        /*Base b1;
        Derived d1=new Derived(2);*/
        Base b1=new Derived(2);
        Derived d2=new Derived();
    }
}
