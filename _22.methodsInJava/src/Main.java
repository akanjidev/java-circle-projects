public class Main {
    public static void main(String[] args) {
        // Method is  block of code that is executed whenever it is called upon or invoked
        String name = "Doe";
        int age = 18;
        hello(name, age); // invoking the hello method by passing 2 arguments matching it set of parameter

        int x = 2;
        int y = 6;
        int z = add(2, 6);
        System.out.println(z);
    }

    static void hello (String name, int age) { // a hello method with 2 parameters with no return
        System.out.println("Hello "+name);
        System.out.println("You are "+age);
    }

    static int add(int a, int b) {
        return a + b;
    }
}