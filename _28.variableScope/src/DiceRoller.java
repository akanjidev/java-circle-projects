import java.util.Random;

public class DiceRoller {
    Random random; // global variable visible everywhere in the class
    int number; // global variable
    DiceRoller () {
        this.random = new Random();
        roll();
    }

    void roll () {
        this.number = random.nextInt(6)+1;
        System.out.println(number);
    }

    void string() {
        String myString = "Roller"; // local variable visible to the string method only
        System.out.println(myString);
    }
}
