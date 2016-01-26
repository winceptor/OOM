public class Date {

    private String dDate;

    private String dTime;

    public Date(String date, String time) {
        this.dDate = date;
        this.dTime = time;
    }

    public String toString() {
        return this.dDate + " " + this.dTime;
    }
}
