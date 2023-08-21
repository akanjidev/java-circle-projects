import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 2D ArrayList is a dynamic list of lists
        // size of these lists can be changed during run time

        ArrayList<ArrayList<String>> grocery = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> softDrinks = new ArrayList<>();
        softDrinks.add("Soda");
        softDrinks.add("coffee");

        grocery.add(bakeryList);
        grocery.add(produceList);
        grocery.add(softDrinks);

        System.out.println(grocery);
        System.out.println(grocery.get(1).get(0));
    }
}