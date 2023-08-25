public class Main {
    public static void main(String[] args) {
        // encapsulation: attributes of a class will be hidden or private,
        //                accessible only through (getters, setters) methods
        //                you should make attributes private if no reason to make them public/protected

        Car car = new Car("Chevrolet", "camaro", 2023);

        // calling the getter methods
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        // using setter methods
        car.setYear(2022);

        System.out.println();
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}