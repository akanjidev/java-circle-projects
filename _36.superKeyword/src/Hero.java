public class Hero extends Person{
    String power;

    Hero(String name, int age, String power) {
        super(name, age); // sending name and age to the parent class constructor (Person)
        this.power = power;
    }

    @Override // overriding the parent method toString
    public String toString() {
        return super.toString() + this.power; // using the super keyword to access the parent class toString method
    }
}
