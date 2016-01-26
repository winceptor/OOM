public class Customer {

    private String cID;

    private String cName;

    private String cPhoneNumber;

    private String cAddress;

    public Customer(String id, String name, String phoneNumber, String address) {
        this.cID = id;
        this.cName = name;
        this.cPhoneNumber = phoneNumber;        
        this.cAddress = address;
    }

    public String toString() {
        return this.cName;
    }
}
