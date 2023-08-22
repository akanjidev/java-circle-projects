public class Dog extends Animal{
    @Override // the @override annotation is used to indicate that we are overriding no additional functionality (Good practice)
    void speak() { // overriding speak method inherited from class Animal
        System.out.println("the Dog goes *bark*");
    }
}
