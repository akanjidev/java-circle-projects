public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year){
        /*
        this.make = make;
        this.model = model;
        this.year = year;
        below we use setter methods instead of setting them directly above
         */

        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    // getter methods
    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    // setter methods
    public void setMake(String make){
        this.make = make;
    }

    public  void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
