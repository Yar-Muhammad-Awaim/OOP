import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name;
    private String location;
    private List<Screen> screens;

    // Constructor
    public Cinema(String name, String location) {
        this.name = name;
        this.location = location;
        this.screens = new ArrayList<>();
    }

    // Add a screen
    public void addScreen(Screen screen) {
        screens.add(screen);
        System.out.println("Screen added successfully.");
    }

    // Display cinema details
    public void displayCinema() {
        System.out.println("Cinema Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Screens:");
        for (Screen screen : screens) {
            screen.displayScreen();
        }
    }
}