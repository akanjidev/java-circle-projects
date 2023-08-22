public class Friend {
    String name;
    static int numberOfFriends; // static method

    Friend (String name) {
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends() {
        System.out.println("You have "+numberOfFriends+" friends");
    }
}
