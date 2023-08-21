public class Main {
    public static void main(String[] args) {
        // Array are used to store multiple values of same datatype in a single variable

        String[] cars = {"Tesla", "BMW", "Mustang", "Toyota"};
        cars[3] = "Corvette";

        System.out.println(cars[0]);
        System.out.println(cars[3]);

        // Additionally we can create an array by declaring  the amount in the array then assign values later
        String[] brands = new String[3];
        brands[0] = "LV";
        brands[1] = "Nike";
        brands[2] = "Google";

        for (int i=0; i<brands.length; i++) {
            System.out.println(brands[i]);
        }

        // for (String brand : brands) {
        //     System.out.println(brand);
        // }
    }
}