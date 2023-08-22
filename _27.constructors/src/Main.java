public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Doe", 30, 70.6); // constructors help us create unique objects
        Human human2 = new Human("John", 35, 67.8);

        System.out.println(human1.name);
        System.out.println(human2.name);

        human2.eat();
        human1.drink();
    }
}