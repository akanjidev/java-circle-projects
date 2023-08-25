package package2;

import package1.*;

public class Asub extends A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.defaultMessage); // now we can access the defaultMessage due to that c is instantiated in the package level it lives

        Asub asub = new Asub();
        System.out.println(asub.protectedMessage); // we can access the protected var in #nt packages as long as that class is a subclass of the class containing the protected var
    }
}
