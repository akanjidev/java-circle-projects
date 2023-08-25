public class Main {
    public static void main(String[] args) {
        Car car = new Car("Chevrolet", "camaro", 2022);
        Car car1 = new Car("Ford", "Mustang", 2022);

        // car = car1; this will not create a copy instead those will behave as two variable names pointing to the same memory address

        car.copy(car1);

        // using overloaded constructor to copy
        Car car2 = new Car(car1);

        System.out.println(car); //#nt memory address
        System.out.println(car1);
        System.out.println();
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}