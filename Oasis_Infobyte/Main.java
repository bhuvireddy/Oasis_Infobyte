import java.util.Scanner;

class Main {
    static Scanner scanner = new Scanner(System.in);
    static String username;
    static String password;

    public static void main(String[] args) {
        login();
        updateProfile();
        updatePassword();
        selectAnswers();
        startTimer();
        autoSubmit();
        closeSession();
        logout();
    }

    static void login() {
        System.out.println("Login");
        System.out.print("Enter username: ");
        username = scanner.nextLine();
        System.out.print("Enter password: ");
        password = scanner.nextLine();
        // Code to validate the username and password
        System.out.println("Logged in successfully!");
        System.out.println();
    }

    static void updateProfile() {
        System.out.println("Update Profile");
        // Code to update profile
        System.out.println("Profile updated successfully!");
        System.out.println();
    }

    static void updatePassword() {
        System.out.println("Update Password");
        // Code to update password
        System.out.println("Password updated successfully!");
        System.out.println();
    }

    static void selectAnswers() {
        System.out.println("Selecting answers for MCQs");
        // Code to display and select answers for MCQs
        System.out.println("Answers submitted successfully!");
        System.out.println();
    }

    static void startTimer() {
        System.out.println("Timer started");
        // Code to start the timer
        System.out.println();
    }

    static void autoSubmit() {
        System.out.println("Auto submitting");
        // Code to automatically submit the answers
        System.out.println("Answers auto-submitted successfully!");
        System.out.println();
    }

    static void closeSession() {
        System.out.println("Closing session");
        // Code to close the session
        System.out.println("Session closed successfully!");
        System.out.println();
    }

    static void logout() {
        System.out.println("Logout");
        // Code to log out the user
        System.out.println("Logged out successfully!");
    }
}
