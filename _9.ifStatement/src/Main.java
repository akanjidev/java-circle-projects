public class Main {
    public static void main(String[] args) {
        // if statement performs a block of code if it's condition evaluates to be true

        int age = 30;

        if (age >= 75) { // if this is true it will skip other statements
            System.out.println("Ok Boomer");
        }
        else if (age>=18) {
            System.out.println("You are an Adult"); // execute if the preceding if-statement is false
        } else {
            System.out.println("You are not an Adult"); // execute if all statement are false
        }
    }
}