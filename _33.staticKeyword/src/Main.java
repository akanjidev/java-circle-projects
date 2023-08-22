public class Main {
    public static void main(String[] args) {
        // static is a modifier, A single copy of a variable/method is created and shared.
        //             the class owns the static member

        Friend friend1 = new Friend("Jane");
        Friend friend2 = new Friend("John");
        Friend friend3 = new Friend("Doe");

        System.out.println(Friend.numberOfFriends); // the class Friend owns the static variable numberOfFriends

        Friend.displayFriends(); // static method

        // it is a best practice to access static members via a class not object
        // a good example of a static method is the round method of the Math class
    }
}