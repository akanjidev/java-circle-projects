import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initializing a scanner

        System.out.println("What is your name? ");
        String name = scanner.nextLine(); // accepting string

        System.out.println("How old are you? ");
        int age = scanner.nextInt(); // accepting integers else exception is raised
        scanner.nextLine(); // reset the scanner: \n

        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello: "+ name);
        System.out.println("you are "+age+" old");
        System.out.println("you like "+food);
    }
}