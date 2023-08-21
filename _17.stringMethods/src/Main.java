public class Main {
    public static void main(String[] args) {
        // String is a reference data type that can store one or more characters.
        // reference data types have access to useful methods

        String name = "Doe";

        System.out.println(name.equals("doe")); // equals() case sensitive
        System.out.println(name.length()); // the length of a string
        System.out.println(name.charAt(0)); // return a char at an index
        System.out.println(name.indexOf("o")); // return int of a char in a string
        System.out.println(name.isEmpty()); // return a boolean
        System.out.println(name.toUpperCase()); // return a new string capitalized
        System.out.println(name.toLowerCase()); // return a string in lower case
        System.out.println(name.trim()); // remove empty spaces before and after a string
        System.out.println(name.replace("e", "o")); // replace an old char to a new char in a string

        // there are many more useful methods
    }
}