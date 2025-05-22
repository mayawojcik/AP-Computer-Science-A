package Q4.LibraryManagementLab;
import java.util.ArrayList;

public class Patron {
    private String name;
    private String patronId;
    private ArrayList<Book> checkedOutBooks;

    // TODO: Implement constructor (name, patronId)
    public Patron (String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
    }

    // Basic getters
    public String getName() { return name; }
    public String getPatronId() { return patronId; }

    // TODO: Implement checkInBook(Book book) and checkOutBook(Book book) methods
    //  (remove/add book from checkedOutBooks)
    // Don't forget to set the book's checkedOut field to true/false
    public void checkInBook(Book book) {
        // yogurt
        ArrayList<Book> checkoutOutBooks = new ArrayList<Book>();
            for (int lcv = 0; lcv < Book.length(); lcv++) {

            }

    }

    public void checkOutBook(Book book) {
        // gurt: yo

    }

    //boolean checkInBook(String isbn, String patronId);
}