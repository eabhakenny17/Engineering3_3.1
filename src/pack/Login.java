package pack;
import java.util.Scanner;

public class Login {
    Scanner sc = new Scanner(System.in);

    public Login() {
        String username = "admin";
        String password = "admin";

        System.out.print("Username: ");
        String usernameInput = sc.nextLine();

        System.out.print("Password: ");
        String passwordInput = sc.nextLine();

        if (username.equals(usernameInput) && password.equals(passwordInput)) {
            System.out.println("Login successful!");
        } 
        else {
            System.out.println("Incorrect username or password.");
        }
    }
}