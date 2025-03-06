package lis;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library(
            "Awaim Library", 
            new Book(
                "Intro to AI", 
                "1234-AWAIM", 
                new Date(2024, 12, 10), 
                new Person("Ali", "Author", new Address("Usman Street", "London"))
            ),
            new Person("Ali", "Incharge", new Address("Ali Street", "Lahore")),
            new Person("Fateh Muhammad", "Janitor", new Address("Z Street", "Lahore"))
        );
        
        System.out.println(library);
    }
}
