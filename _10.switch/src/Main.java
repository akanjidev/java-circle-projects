public class Main {
    public static void main(String[] args) {
        // switch statement allows a variable to be tasted for equality against a list of values

        String day = "Thursday";
        switch (day) {
            case "Sunday" -> System.out.println("It is Sunday!");
            case "Monday" -> System.out.println("It is Monday!");
            case "Tuesday" -> System.out.println("It is Tuesday!");
            case "Wednesday" -> System.out.println("It is Wednesday!");
            case "Thursday" -> System.out.println("It is Thursday!");
            case "Friday" -> System.out.println("It is Friday!");
            case "Saturday" -> System.out.println("It is Saturday!");
            default -> System.out.println("That's not a day");
        }
    }
}