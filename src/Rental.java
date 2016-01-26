public class Rental {

    private Customer rCustomer;

    private Car rCar;

    private Date rStartDate;

    private Date rEndDate;

    public Rental(Customer customer, Car car, Date dateStart, Date dateEnd) {
        this.rCustomer = customer;
        this.rCar = car;
        this.rStartDate = dateStart;
        this.rEndDate = dateEnd;
    }

    public String toString() {
        return this.rCustomer.toString() + " rented " + this.rCar.toString() + " from " + this.rStartDate.toString() + " to " + this.rEndDate.toString();
    }
}
