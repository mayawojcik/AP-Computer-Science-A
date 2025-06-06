package Q4.LibraryManagementLab;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    /* ========== DO NOT MODIFY (Except data file path) ========== */
    public static ArrayList<Book> loadCatalog() {
        try {
            // Dataset source: https://www.kaggle.com/datasets/saurabhbagchi/books-dataset
            System.out.print("Loading catalog...");
            String path = "LibraryManagementLab/book_catalog.csv";  // Change directory as needed
            Scanner file = new Scanner(new File(path));
            ArrayList<Book> books = new ArrayList<>();
            while (file.hasNextLine()) {
                String[] bookData = file.nextLine().split(";");
                String isbn = bookData[0];
                String title = bookData[1];
                String author = bookData[2];
                Book book = new Book(title, isbn, author);
                books.add(book);
            }
            file.close();
            System.out.println("success.");
            return books;
        } catch (FileNotFoundException e) {
            System.out.println("\nFile not found. Returning empty catalog.");
        }
        return new ArrayList<>();
    }

    // TODO: Implement main program; make a new Library object, load the catalog,
    // add each book from the catalog to the library, then display the menu
    // bruh.
    public static void main(String[] args) {
        Scanner sydney = new Scanner(System.in);
        // I <3 Sydney!!!!!
        System.out.println("Menu:\n" + "1.\tAdd Patron" + "2.\tAdd Book" +
                "3.\tRemove Book" + "4.\tCheckout Book" + "5.\tReturn Book" +
                "6.\tSearch Book" + "7.\tSearch Book Transaction" + "8.\tExit");
        System.out.println("Enter choice: ");
            int num = sydney.nextInt();

    }
}