public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage();

        Car car = new Car("BMW");
        Car car1 = new Car("Tesla");

        garage.pack(car);
        garage.pack(car1);
    }
}