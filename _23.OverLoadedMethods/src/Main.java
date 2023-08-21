public class Main {
    public static void main(String[] args) {
        // Overloaded methods are methods that share the same name but have different parameters
        // number parameters or data types and order of values
        // method name + parameters = method signature
        // So they have #nt signature

        System.out.println(add(9, 3));
        System.out.println(add(2.0, 3.0));
        System.out.println(add(10, 5, 6));
        System.out.println(add(30, 10, 40, 2));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static  double add(double a, double b) {
        return a + b;
    }
}