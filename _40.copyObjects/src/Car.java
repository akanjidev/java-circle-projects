public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    Car(Car from) {
        this.copy(from);
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void copy(Car from){ // this function will copy the make, model and year from another object
        this.setMake(from.make);
        this.setModel(from.model);
        this.setYear(from.year);
    }
}