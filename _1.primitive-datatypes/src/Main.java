public class Main {
    public static void main(String[] args) {
        // boolean stores 2 values true or false it holds 1 bit
        boolean isValid = true;

        // byte holds 1 byte numbers from -128 to 127
        byte byteVar = 2;

        // short holds 2 bytes, numbers from -32_768 to 32_767
        short shortVal = 12_000;

        // int holds 4 bytes , numbers from -2 billion to 2 billion
        int accountBalance = 2_000_000;

        // long holds 8 bytes, number from -9 quintillion to 9 quintillion
        long totalPopulation = 8_000_000_000L;

        // float holds 4 bytes, fractional number up to 6-7 digits, ends with f
        float scorePrediction = 42.888f;

        // double holds 8 bytes, fractional number up to 15 digits
        double totalQueries = 100.22022020022;

        // char holds 2 bytes, a single character, letter or ascii value
        char a = 'A';

        // string varies and not primitive
        String myString = "JavaDev";
        System.out.println(myString);

        // primitive data types Vs Reference data type
        /* Primitive data types                 Reference data types
        *  8 types(boolean, int, long...        Unlimited (user defined)
        *  Store data                           store address
        *  Can only hold one value              Can hold more than one value
        *  Less memory                          more memory
        *  Faster                               Slower*/

        // Variable Declaration, Assignment and Initialization
        int x; // declaration
        x = 2; // assignment
        int y = 5; // Initialization
    }
}