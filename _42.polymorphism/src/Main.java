public class Main {
    public static void main(String[] args) {
        /*
            polymorphism: greek word poly-"many", morph-"form"
                          The ability of an object to identify as more than one type
         */

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat}; // creating an array of Car, Bicycle and Boat but all in common are Vehicles

        for (Vehicle racer : racers) {
            racer.go();
        }
    }
}