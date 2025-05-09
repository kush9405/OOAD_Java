// Low coupling
class Traveler {
    private Vehicle v;
    public Vehicle getV() {
         return v;
    }
    public void setV(Vehicle v) {
        this.v = v;
    }

    public void startJourney() {
         v.move();
    }
    public static void main(String[] args) {
        Traveler traveler = new Traveler();
        traveler.setV(new Car()); // Inject Car dependency
        Vehicle bro=traveler.getV();
        System.out.println(bro);
        traveler.startJourney(); // start journey by Car
        traveler.setV(new Bike()); // Inject Bike dependency
        traveler.startJourney(); // Start journey by Bike
    }
}