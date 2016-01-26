public class Mainclass {

    public static void main(String[] args) {
        Customer newCustomer = new Customer("121290-2000", "Pekka Pouta", "040123123", "Korpimetsänkatu 6-8 c 9");
        Car newCar = new Car("OSF-357", "Tesla", "Model S", "2015");
        Date newStartDate = new Date("26.01.2016", "00:00");
        Date newEndDate = new Date("26.02.2016", "00:00");
        
        Rental newRental = new Rental(newCustomer, newCar, newStartDate, newEndDate);
        String outputString = new String();
        outputString = newRental.toString();
        System.out.print(outputString + "\n");
    }
}
