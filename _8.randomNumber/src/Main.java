import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(6); // from 0 to 5, 6 not included
        double y = random.nextDouble(); // between 0 and 1
        boolean z = random.nextBoolean(); // true or false

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}