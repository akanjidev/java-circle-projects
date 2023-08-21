public class Main {
    public static void main(String[] args) {
        // printf(): an optional method to control, format, and display text to the console window
        // two arguments: format string + (object/variable/value)
        // % [flags] [precision] [width] [conversion-character]

        boolean bool = true;
        char ch = '&';
        int num = 4;
        String name = "John Doe";
        double myDouble = 1000;

        System.out.printf("%b",bool); // conversion-character of a boolean
        System.out.printf("%c",ch); // conversion-character of a character
        System.out.printf("%s",name); // conversion-character of a string
        System.out.printf("%d",num); // conversion-character of an integer
        System.out.printf("%f",myDouble); // conversion-character of a double

        // [width] min numbers of character to be written as output
        System.out.printf("Hello %10s",name); // min 10

        //[precision]
        //sets number of digits of precision when outputting floating points values
        System.out.printf("You have this money %.2f", myDouble);

        //[flags]
        //adds an effect to the output based on the flag added to format specifier
        // - : left-justified
        // + : output a plus (+) or minus (-) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        System.out.printf("You have this money %-20f", myDouble); // left justified with min 20 chars
        System.out.printf("You have this money %20f", myDouble); // right justified with min 20 chars
        System.out.printf("You have this money %+f", myDouble); // add a + sign
        System.out.printf("You have this money %020f", myDouble); // padded right by 0s
        System.out.printf("You have this money %,f", myDouble); // adds a comma at thousands place
    }
}