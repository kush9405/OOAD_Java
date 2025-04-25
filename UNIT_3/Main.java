import librarysystem.Book;
import librarysystem.User;
import librarysystem.Library;
import librarysystem.LibraryController;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryController controller = new LibraryController(library);

        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.registerUser(new User("Alice", 1));
        library.registerUser(new User("Kushagra", 2));

        library.showUsers();
        library.showBooks();
        controller.borrowBook("1984");
        library.showBooks();
    }
}
