public class Main {
    public static void main(String[] args) {
        // overloaded constructors: multiple constructors within a class with the same name, but have #nt parameters
        // name + parameters = signature

        Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");

        System.out.println("Here are ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

        Pizza newPizza = new Pizza("Thick crust", "tomato", "mozzarella");
        System.out.println("Here are ingredients of your new pizza: ");
        System.out.println(newPizza.bread);
        System.out.println(newPizza.sauce);
        System.out.println(newPizza.cheese);

        Pizza emptyPizza = new Pizza();

    }
}