//Vehicle interface to allow loose coupling implementation.
interface Vehicle {
    public void move();
}
//Car class implements Vehicle interface.
class Car implements Vehicle {
    @Override
    public void move() {
         System.out.println("Car is moving");
    }
}
//Bike class implements Vehicle interface.
class Bike implements Vehicle {
    @Override
    public void move() {
         System.out.println("Bike is moving");
    }
}
