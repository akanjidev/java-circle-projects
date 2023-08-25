public class Main {
    public static void main(String[] args) {
        // abstract: abstract classes cannot be instantiated, but can have a subclass that can be
        //           abstract methods are declared without implementation

        Car car = new Car();
        // Vehicle vehicle = new Vehicle(); we can not instantiate on Vehicle

        car.go();
    }
}