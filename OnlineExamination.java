import java.util.Scanner;

class User {
    String username;
    String password;
    // Other user profile fields

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Methods to update profile, change password, etc.
}

class MCQ {
    String question;
    String[] options;
    int correctOption;

    public MCQ(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }

    // Other methods related to MCQs
}

class Timer {
    // Timer implementation with auto-submit
}

public class OnlineExamination {
    static User loggedInUser = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void login(Scanner scanner) {
        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        // Perform authentication
        if (authenticate(username, password)) {
            loggedInUser = new User(username, password);
            System.out.println("Login successful.");

            // Call functions for profile management, MCQs, timer, etc.
            // For example:
            // manageProfile(scanner);
            // solveMCQs(scanner);
            // startTimer(scanner);
        } else {
            System.out.println("Login failed. Please check your credentials.");
        }
    }

    public static boolean authenticate(String username, String password) {
        // Perform authentication logic here
        // For example, compare with stored user data or connect to a database
        return true; // Return true for demonstration purposes
    }
}
