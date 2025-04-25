import java.util.List;
import java.util.ArrayList;

// Represents a Book
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getDetails() {
        return "Title: " + title + ", Author: " + author;
    }
}

// Represents a Library
class Library {
    private List<Book> books = new ArrayList<>();

    // Creator Pattern: Library creates Book objects
    public void addBook(String title, String author) {
        Book book = new Book(title, author); // Library creates the Book
        books.add(book);
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book.getDetails());
        }
    }
}

// Main class to test the program
public class Main2 {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook("1984", "George Orwell");

        // Displaying books in the library
        library.showBooks();
    }
}