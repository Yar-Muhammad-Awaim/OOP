public class Main {
    public static void main(String[] args) {
        // Create a cinema
        Cinema cinema = new Cinema("Multiplex Cinemas", "Downtown");

        // Create a customer
        Customer customer = new Customer(1, "John Doe", "123-456-7890", "john.doe@example.com");

        // Create a screen
        Screen screen = new Screen(1, "Avengers: Endgame", 10, 10);

        // Add the screen to the cinema
        cinema.addScreen(screen);

        // Display the cinema
        cinema.displayCinema();

        // Book a seat
        screen.bookSeat(5, 5, customer);
    }
}