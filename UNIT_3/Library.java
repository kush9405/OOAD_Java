import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) { books.add(book); }
    public void registerUser(User user) { users.add(user); }
    public void showBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
    public void showUsers(){
        for (User user:users){
            System.out.println(user);
        }
    }

    // Getter for books
    public List<Book> getBooks() {
        return books;
    }
}