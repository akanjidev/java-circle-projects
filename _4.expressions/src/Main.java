public class Main {
    public static void main(String[] args) {
        // expression : operands & operators
        // operands: values, variables, numbers, quantity
        // operators: +, -, *, / %

        int friends = 10;

        // addition
        System.out.println(friends + 1);
        // subtraction
        System.out.println(friends - 2);
        // division
        System.out.println(friends / 2);
        // multiplication
        System.out.println(friends * 2);
        // modulus
        System.out.println(friends % 3);

        // when you divide a number with an integer the decimal portion is trimmed
        // to fix this we cast our output as a double
        double client = 20;
        System.out.println((double) client / 3); // (datatype) expression

        // Incrementation and decremental
        System.out.println(friends++);
        // friends++; post incr:
        System.out.println(++friends);
        // pre incr:

        // works the same ways as decremental

    }
}