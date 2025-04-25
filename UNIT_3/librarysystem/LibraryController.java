package librarysystem;
public class LibraryController {
    private Library library;

    public LibraryController(Library library) {
        this.library = library;
    }

    public void borrowBook(String title) {
        for (Book book : library.getBooks()) { // Use the getter method since books is private
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                book.borrowBook();
                System.out.println("Book borrowed successfully!");
                return;
            }
        }
        System.out.println("Book not available!");
    }
}