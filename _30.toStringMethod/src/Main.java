public class Main {
    public static void main(String[] args) {
        // toString(): special method that all objects inherit.
        // it returns a string that textually represents an object.
        // can be used both implicitly and explicitly

        Car car = new Car();

        System.out.println(car.toString()); // explicitly use
        System.out.println();
        System.out.println(car); // implicitly use
    }
}