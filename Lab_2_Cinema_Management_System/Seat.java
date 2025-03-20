public class Seat {
    private int seatNumber;
    private int rowNumber;
    private SeatType type;
    private double price;
    private boolean isBooked;

    // Constructor
    public Seat(int seatNumber, int rowNumber, SeatType type, double price) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.type = type;
        this.price = price;
        this.isBooked = false;
    }

    // Book the seat
    public boolean bookSeat() {
        if (!isBooked) {
            isBooked = true;
            return true;
        }
        return false;
    }

    // Display seat details
    public void display() {
        System.out.println("Seat Number: " + seatNumber + ", Row: " + rowNumber + ", Type: " + type + ", Price: $" + price + ", Booked: " + isBooked);
    }

    // Getters and Setters
    public int getSeatNumber() {
        return seatNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public SeatType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBooked() {
        return isBooked;
    }
}