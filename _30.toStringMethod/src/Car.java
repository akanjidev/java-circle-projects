public class Car {
    String make = "Ford";
    String model = "Mustang";
    String color = "black";
    int year = 2023;

    // overing the toString method, normally it returns the address of an object in the memory
    // but here we want it to return a textual representation of our objects

    public String toString() {
        return this.make+"\n"+this.model+"\n"+this.color+"\n"+this.year;
    } // public method and returns a string
}
