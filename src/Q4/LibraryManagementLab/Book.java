package Q4.LibraryManagementLab;

public class Book extends Media {
    private String author;

    // TODO: Implement constructor (title, isbn, author); call super constructor
    public Book(String title, String isbn, String author) {
        super(title, isbn);
    }


    public String getAuthor() { return author; }
    public String getTitle() { return title; }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", author='" + author + '\'' +
                 '}';
    }
}