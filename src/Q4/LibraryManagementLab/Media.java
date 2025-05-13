package Q4.LibraryManagementLab;

public abstract class Media {
    private String title;
    private String isbn;
    private boolean isCheckedOut;

    // TODO: Implement constructor (title, isbn)
    public Media(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    // TODO: Implement getter methods
    public String getTitle() { return title; }
    public String getIsbn() { return isbn; }
    public void setCheckedOut(boolean checkedOut) { isCheckedOut = checkedOut; }
}