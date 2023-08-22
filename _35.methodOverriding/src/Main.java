public class Main {
    public static void main(String[] args) {
        //  method overriding: Declaring a method in a subclass, which is already present in parent class.
        // done so that child class can have its own implementation.

        Dog dog = new Dog();
        Animal animal = new Animal();

        animal.speak();
        dog.speak();
    }
}