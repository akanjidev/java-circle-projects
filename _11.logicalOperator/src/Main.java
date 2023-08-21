public class Main {
    public static void main(String[] args) {
        // Logical operators are used to connect two or more expressions
        // && = (AND) both conditions must be true
        // || = (OR) either condition must be true
        // ! = (NOT) reverse boolean value of condition

        int temperature = 21;

        if (temperature >=20 && temperature <=30) {
            System.out.println("It's warm outside");
        } else if (temperature > 30) {
            System.out.println("It's hot outside");
        } else {
            System.out.println("It's cold outside");
        }

        // for other operators https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4596s
    }
}