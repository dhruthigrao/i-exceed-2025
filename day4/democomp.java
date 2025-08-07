// Engine class
class Engine {
    public void start() {
        System.out.println("Engine started.");
    }

    public void stop() {
        System.out.println("Engine stopped.");
    }
}

// Car class using composition
class Car {
    private Engine engine; // Car HAS-A Engine

    public Car() {
        this.engine = new Engine(); // Create an Engine instance when a Car is created
    }

    public void startCar() {
        System.out.println("Car starting...");
        engine.start(); // Delegate engine starting to the Engine object
    }

    public void stopCar() {
        System.out.println("Car stopping...");
        engine.stop(); // Delegate engine stopping to the Engine object
    }
}

// Main class to demonstrate
public class democomp {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startCar();
        myCar.stopCar();
    }
}
