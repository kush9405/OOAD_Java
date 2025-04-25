import java.util.ArrayList;
import java.util.List;

import librarydemo.Book;
import librarydemo.Library;

// Book class: Stores book details
class Book {
    private int id;
    private String name;

    public Book(int bookId, String bookName) 
    {
        this.id = bookId;
        this.name = bookName;
    }

    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }
}

// Library class: Manages book collection
class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) 
    {
        books.add(book);
    }

    public List<Book> getBooks() 
    {
        return books;
    }
}

// BookSearch class: Handles searching books
class BookSearch {
    public String searchByName(List<Book> books, String name) 
    {
        for (Book book : books) {
            if (book.getName().equals(name)) 
            {
                return "Book found! ID: " + book.getId();
            }
        }
        return "Book doesn't exist.";
    }
}

// Main class
public class BookManagement {
    public static void main(String[] args) {
        Library library = new Library();
        BookSearch search = new BookSearch();

        // Adding books to library
        library.addBook(new Book(10, "ICUP"));
        library.addBook(new Book(100, "IC"));

        // Searching for books
        System.out.println(search.searchByName(library.getBooks(), "ICUP"));
        System.out.println(search.searchByName(library.getBooks(), "ICU")); // Searching for a non-existent book
    }
}