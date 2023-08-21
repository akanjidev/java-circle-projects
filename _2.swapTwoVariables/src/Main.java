public class Main {
    public static void main(String[] args) {
        // Let's say we want to swap two variables using Java.
        // For example, think of swapping a glass of water and a glass of mixed kool-aid.
        // In this case, we'll use an additional empty glass to facilitate the swap.

        // Similarly, when swapping variables in Java, we need a temporary variable to act like the empty glass.
        // The temporary variable holds the value of one variable temporarily so that we can assign the value
        // of the second variable to the first, and then finally assign the value from the temporary variable to the second.

        String x = "water"; // initialization
        String y = "kool-aid"; // initialization

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        String temp; // temp declaration
        // swapping
        temp = x;
        x = y;
        y = temp;

        System.out.println("\nAfter swap");
        System.out.println("new x: " + x);
        System.out.println("new y: " + y);
    }
}