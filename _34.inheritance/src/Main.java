public class Main {
    public static void main(String[] args) {
        // inheritance = the process where one class acquire, the attributes and methods of another.
        // extends keyword is used to inherit

        Car car = new Car();
        Bicycle bike = new Bicycle();

        car.go();
        bike.stop();

        System.out.println(car.doors); // unique to car class
        System.out.println(bike.pedals); // unique to bicycle class
    }
}