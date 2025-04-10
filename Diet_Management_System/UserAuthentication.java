package Diet_Management_System;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserAuthentication {

    // Store user credentials (username and password)
    private static final Map<String, String> userCredentials = new HashMap<>();

    // Method to register a new user
    public static void registerUser(String username, String password) {
        if (userCredentials.containsKey(username)) {
            System.out.println("Username already exists. Please choose a different one.");
            return;
        }

        // Ideally, you'd hash the password before storing it for security!
        userCredentials.put(username, password);  // Storing plain text password for simplicity
        System.out.println("User registered successfully!");
    }

    // Method to authenticate a user
    public static boolean authenticateUser(String username, String password) {
        if (!userCredentials.containsKey(username)) {
            System.out.println("Username not found.");
            return false;
        }

        String storedPassword = userCredentials.get(username);

        // Compare the entered password with the stored password
        if (storedPassword.equals(password)) {
            System.out.println("Authentication successful!");
            return true;
        } else {
            System.out.println("Incorrect password.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage:
        System.out.println("Welcome to the Authentication System!");

        // Register a new user (example)
        System.out.print("Do you want to register a new user? (yes/no): ");
        String registerChoice = scanner.nextLine().toLowerCase();

        if (registerChoice.equals("yes")) {
            System.out.print("Enter username: ");
            String newUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            String newPassword = scanner.nextLine();
            registerUser(newUsername, newPassword);
        }


        // Authenticate an existing user
        System.out.print("Enter username to login: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (authenticateUser(username, password)) {
            System.out.println("Welcome, " + username + "!");
            //  Now you can grant access to the application's features
            //  based on successful authentication.
        } else {
            System.out.println("Authentication failed. Access denied.");
        }

        scanner.close();
    }
}