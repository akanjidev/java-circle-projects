public class Main {
    public static void main(String[] args) {
        // super keyword refers to the superclass (parent) of an object, very similar to the "this" keyword.

        Hero hero1 = new Hero("Batman", 44, "&&&&");
        Hero hero2 = new Hero("Superman", 45, "$$$$");

        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);
        System.out.println();

        System.out.println(hero2.toString());
    }
}