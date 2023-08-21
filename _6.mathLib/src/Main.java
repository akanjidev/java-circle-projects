public class Main {
    public static void main(String[] args) {
        double x = 5.5;
        double y = 10;
        double z = - 30;

        System.out.println(Math.max(x, y)); // return the largest number
        System.out.println(Math.min(y, x)); // return the smallest number
        System.out.println(Math.abs(z)); // absolute value

        System.out.println(Math.round(3.229299)); // round
        System.out.println(Math.ceil(3.5221)); // round up
        System.out.println(Math.floor(3.5433)); // round down
    }
}