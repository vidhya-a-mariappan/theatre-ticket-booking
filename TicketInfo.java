package zsm.console.PICinemas;

public class TicketInfo {

    private int screenNumber;
    private int showNumber;
    private String seatNumber;
    private boolean available;

    TicketInfo(int screenNo, int showNo, String seatNo, boolean available) {
        this.screenNumber = screenNo;
        this.showNumber = showNo;
        this.seatNumber = seatNo;
        this.available = available;
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

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}
