public class Car {

    private String cID;

    private String cMake;

    private String cModel;

    private String cYear;

    public Car(String id, String make, String model, String year) {
        this.cID = id;
        this.cMake = make;
        this.cModel = model;
        this.cYear = year;
    }

    public String toString() {
        return this.cMake + " " + this.cModel;
    }
}
