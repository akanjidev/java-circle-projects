import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            polymorphism = many shapes/forms
            dynamic = after compilation (during runtime)

            ex: a corvette is a corvette, and a car, and a vehicle, and an object
         */

        Scanner scanner = new Scanner(System.in);
        Animal animal; // creating an animal placeholder

        System.out.println("What animal do you want");
        System.out.print("(1=dog) or (2=car): "); // listening to user inputs
        int choice = scanner.nextInt();

        if(choice==1){
            animal = new Dog(); // assigning to dog
            animal.speak();
        }
        else if(choice==2) {
            animal = new Cat(); // assigning to cat
            animal.speak();
        }
        else {
            animal = new Animal();
            System.out.println("Invalid choice");
            animal.speak();
        }
    }
}