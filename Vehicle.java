// 1. Base Class: Vehicle//
public class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

//2. Subclass: Car
public class Car extends Vehicle {
    @Override
    public void start() {
        super.start();  // optional: call base method
        System.out.println("Car engine started.");
    }

    @Override
    public void stop() {
        super.stop();  // optional
        System.out.println("Car engine stopped.");
    }
}

// 3. Subclass: Bike
public class Bike extends Vehicle {
    @Override
    public void start() {
        super.start();  // optional
        System.out.println("Bike is now running.");
    }

    @Override
    public void stop() {
        super.stop();  // optional
        System.out.println("Bike has stopped.");
    }
}

//4. Test with Polymorphism
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myCar.stop();

        System.out.println("----");

        myBike.start();
        myBike.stop();
    }
}
