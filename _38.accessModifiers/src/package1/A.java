package package1;
import package2.*;

public class A {
    protected String protectedMessage = "This is a protected message";
    public static void main(String[] args){
        C c = new C();
        // System.out.println(c.defaultMessage); we can not access the var defaultMessage because it has a no modifier, and it is limited to package scope
        System.out.println(c.publicMessage); // we can access the var publicMessage bcs it is public

        B b = new B();
        // System.out.println(b.privateMessage); we can not access a private element even in the same package
    }
}
