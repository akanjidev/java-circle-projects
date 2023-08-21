import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // forEach Loop: traversing technique to iterate through the elements in an array/collection with fewer steps in a readable way
        // however it has less flexibility
        // foeEach also called enhanced for loop

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cow");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Bird");

        for (String animal : animals) { // enhanced for Loop
            System.out.println(animal);
        }
    }
}