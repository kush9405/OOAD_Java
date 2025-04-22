// Step 1: Define an abstraction (interface)
interface DisplayDevice {
    void turnOn();
}

// Step 2: Create concrete devices implementing the abstraction
class TV implements DisplayDevice {
    public void turnOn() {
        System.out.println("Turning on the TV.");
    }
}

class Projector implements DisplayDevice {
    public void turnOn() {
        System.out.println("Turning on the Projector.");
    }
}

// Step 3: The HomeTheater class depends on the abstraction (DisplayDevice) instead of a concrete class
class HomeTheater {
    private DisplayDevice displayDevice;  // HomeTheater now depends on the abstraction (interface)

    public HomeTheater(DisplayDevice displayDevice) {
        this.displayDevice = displayDevice;  // Inject the specific device (TV or Projector)
    }

    public void watchMovie() {
        displayDevice.turnOn();  // Use the device (TV or Projector)
        System.out.println("Watching movie.");
    }
}

public class Dip {
    public static void main(String[] args) {
        // Using TV
        DisplayDevice tv = new TV();
        HomeTheater homeTheater = new HomeTheater(tv);  // Injecting the TV
        homeTheater.watchMovie();  // It will use the TV to watch a movie

        System.out.println();

        // Using Projector
        DisplayDevice projector = new Projector();
        homeTheater = new HomeTheater(projector);  // Injecting the Projector
        homeTheater.watchMovie();  // It will use the Projector to watch a movie
    }
}
