package zsm.console.PICinemas;

public class CustomerInfo {
    private String name;
    private String mobileNumber;
    private int totalNoOfTickets;
    private String totalSeatNumber;
    private int screenNumber;
    private int showNumber;
    private int amount;
    private double totalAmount;

    public CustomerInfo(String name, String mobileNo, int totalNoOfTickets, String totalSeatNo, int screenNo, int show, int amount, double totalAmount) {
        this.name = name;
        this.mobileNumber = mobileNo;
        this.totalNoOfTickets = totalNoOfTickets;
        this.totalSeatNumber = totalSeatNo;
        this.screenNumber = screenNo;
        this.showNumber = show;
        this.amount = amount;
        this.totalAmount = totalAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getTotalNoOfTickets() {
        return totalNoOfTickets;
    }

    public void setTotalNoOfTickets(int totalNoOfTickets) {
        this.totalNoOfTickets = totalNoOfTickets;
    }

    public String getTotalSeatNumber() {
        return totalSeatNumber;
    }

    public void setTotalSeatNumber(String totalSeatNumber) {
        this.totalSeatNumber = totalSeatNumber;
    }

    public int getScreenNumber() {
        return screenNumber;
    }

    public void setScreenNumber(int screenNumber) {
        this.screenNumber = screenNumber;
    }

    public int getShowNumber() {
        return showNumber;
    }

    public void setShowNumber(int showNumber) {
        this.showNumber = showNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

}
