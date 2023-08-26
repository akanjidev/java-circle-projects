import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            exception= an event that occurs during the execution of a program that
            disrupts the normal flow of instructions
         */

        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Enter a whole number to divide: ");
            int num = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int num2 = scanner.nextInt();

            int res = num / num2;
            System.out.printf("Result: %d\n", res);
        } catch (ArithmeticException e) { // will execute if the ArithmeticException is raised
            System.out.println("You can't divide by Zero");
        } catch (InputMismatchException e) { // execute if the InputMismatchException is raised
            System.out.println("Please enter a number");
        } catch (Exception e) { // execute when any exception is raised
            System.out.println("Something went wrong");
        } finally { // will run regardless if the exception is raised or not
            // System.out.println("This always print");
            scanner.close();
        }
    }
}