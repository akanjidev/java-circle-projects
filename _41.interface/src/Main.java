public class Main {
    public static void main(String[] args) {
        /* interface: a template that can be applied to a class.
                      similar to inheritance, but specifies what a class has/must do.
                      classes can apply more than one interface, inheritance is limited to one direct super class

                      implements keyword is used to implement an interface
         */

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee(); // the rabbit implements only the Prey interface

        hawk.hunt(); // the hawk implements only the Predator interface

        // the fish implements both Prey and Predator interfaces
        fish.flee();
        fish.hunt();
    }
}