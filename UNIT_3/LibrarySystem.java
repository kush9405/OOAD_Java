import java.util.*;

// Book class: Stores book details
class Book {
    private String name;
    private int id;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

// Abstract SearchStrategy: Allows different search implementations
interface SearchStrategy {
    int search(List<Book> books, String criteria);
}

// Search by Name (Exact match)
class SearchByName implements SearchStrategy {
    @Override
    public int search(List<Book> books, String name) {
        for (Book book : books) {
            if (book.getName().equals(name)) {
                return book.getId();
            }
        }
        return 0;
    }
}

// Search by ID
class SearchById implements SearchStrategy {
    @Override
    public int search(List<Book> books, String idStr) {
        int id = Integer.parseInt(idStr);
        for (Book book : books) {
            if (book.getId() == id) {
                return book.getId();
            }
        }
        return 0;
    }
}

// **New Search: Search by Substring in Name**
class SearchBySubstring implements SearchStrategy {
    @Override
    public int search(List<Book> books, String substring) {
        for (Book book : books) {
            if (book.getName().contains(substring)) {
                return book.getId();
            }
        }
        return 0;
    }
}

// Library class: Stores books & allows flexible search strategies
class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public int search(SearchStrategy strategy, String criteria) {
        return strategy.search(books, criteria);
    }
}

// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        Book b1 = new Book(10, "ICUP");
        Book b2 = new Book(100, "IC");
        Book b3 = new Book(55, "C++ Programming");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        // Create different search strategies
        SearchStrategy searchByName = new SearchByName();
        SearchStrategy searchById = new SearchById();
        SearchStrategy searchBySubstring = new SearchBySubstring();

        // Search by exact name
        int val = library.search(searchByName, "ICUP");
        System.out.println(val == 0 ? "Book doesn't exist" : "Book ID: " + val);

        // Search by ID
        val = library.search(searchById, "100");
        System.out.println(val == 0 ? "Book doesn't exist" : "Book ID: " + val);

        // Search by substring (e.g., searching for "C++" should match "C++ Programming")
        val = library.search(searchBySubstring, "C++");
        System.out.println(val == 0 ? "Book doesn't exist" : "Book ID: " + val);
    }
}