import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sideX;
        double sideY;
        double result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        sideX = scanner.nextDouble();

        System.out.println("Enter side y: ");
        sideY = scanner.nextDouble();

        result = Math.sqrt((sideX * sideX) + (sideY * sideY));
        System.out.println("The hypotenuse is: "+result);

        scanner.close();
    }
}