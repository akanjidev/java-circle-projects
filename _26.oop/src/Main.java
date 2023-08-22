public class Main {
    public static void main(String[] args) {
        // Objects: an instance of a class that may contain attributes and methods
        // Example: phone, computer, desk.

        Car myCar = new Car(); // instantiation

        System.out.println(myCar.model); // accessing attributes
        System.out.println(myCar.make);

        myCar.drive(); // invoking methods
        myCar.blake();

        // we can create multiple instances of a class
        Car mySecondCar = new Car();

        System.out.println(mySecondCar.color);

        mySecondCar.drive();
    }
}