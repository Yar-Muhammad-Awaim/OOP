import java.util.Arrays;

public class Screen {
    private int screenNumber;
    private String movieTitle;
    private Seat[][] seats;

    // Constructor
    public Screen(int screenNumber, String movieTitle, int rows, int cols) {
        this.screenNumber = screenNumber;
        this.movieTitle = movieTitle;
        this.seats = new Seat[rows][cols];

        // Initialize seats
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                SeatType type = (i == 0 || i == rows - 1) ? SeatType.VIP : SeatType.REGULAR;
                double price = (type == SeatType.VIP) ? 15.0 : 10.0;
                seats[i][j] = new Seat(j + 1, i + 1, type, price);
            }
        }
    }

    // Book a seat
    public boolean bookSeat(int row, int col, Customer customer) {
        if (row >= 1 && row <= seats.length && col >= 1 && col <= seats[0].length) {
            Seat seat = seats[row - 1][col - 1];
            if (!seat.isBooked()) {
                if (seat.bookSeat()) {
                    // Create a ticket
                    Ticket ticket = new Ticket(1, customer, screenNumber, seat.getSeatNumber(), movieTitle, seat.getPrice());
                    System.out.println("Ticket booked successfully!");
                    ticket.displayTicket();
                    return true;
                }
            } else {
                System.out.println("Seat is already booked.");
            }
        } else {
            System.out.println("Invalid seat coordinates.");
        }
        return false;
    }

    // Display screen details
    public void displayScreen() {
        System.out.println("Screen Number: " + screenNumber + ", Movie Title: " + movieTitle);
        System.out.println("Seats:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                seats[i][j].display();
            }
            System.out.println();
        }
    }
}