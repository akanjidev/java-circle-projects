public class Main {
    public static void main(String[] args) {
        // wrapper class provides a way to use primitive data types as reference data types.
        // reference data types contain useful methods
        // can be used with collections example ArrayList

        // Primitive     Wrapper
        // --------------------
        // boolean       Boolean
        // char          Character
        // int           Integer
        // double        Double

        // Autoboxing is the automatic conversion that the JAVA compiler makes between the primitive data type and their corresponding object wrapper classes
        // Unboxing is the reverse of autoboxing. automatic conversion from wrapper class to primitive

        Boolean a = true;
        Character b = '&';
        Integer c = 3;
        Double d = 4.3;
        String e = "Java";

        System.out.println(c);
    }
}