import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Nested Loop is loop inside loop

        Scanner scanner = new Scanner(System.in);
        double rows;
        double columns;
        String symbol;

        System.out.println("Enter # of rows: ");
        rows = scanner.nextDouble();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextDouble();

        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for (int i=1; i<=rows; i++) {
            System.out.println();
            for (int j=1; j<=columns; j++) {
                System.out.print(symbol);
            }
        }
    }
}