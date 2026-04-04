class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick");
    }
}

class Runtime {
    public static void main(String[] args) {

        Vehicle v1 = new Car();   // Parent reference, child object
        Vehicle v2 = new Bike();

        v1.start();   // Calls Car's start()
        v2.start();   // Calls Bike's start()
    }
}