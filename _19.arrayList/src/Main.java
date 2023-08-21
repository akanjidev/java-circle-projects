import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList: Resizable array.
        //            Add and remove elements after compilation phase
        //            Store reference data types

        ArrayList<String> food = new ArrayList<String>();

        // adding elements using add function
        food.add("Pizza");
        food.add("Tacos");
        food.add("hamburger");

        // set method to set an element at an index
        food.set(2, "Sushi");

        // remove method remove an element at an index
        food.remove(2);

        for(int i=0; i<food.size(); i++) { // size method return the length
            System.out.println(food.get(i)); // get return the element at an index
        }

        // clear method removed all elements
        food.clear();
    }
}