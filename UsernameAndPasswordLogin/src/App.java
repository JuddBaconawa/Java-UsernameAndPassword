//packages


//imports
import java.util.Scanner;

//main class titled "App"
public class App {

    //Main method where the main execution of code happens
    public static void main(String[] args) throws Exception {
    
        //scanner initialized
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = scanner.nextLine();

        System.out.println("Enter password");
        String password = scanner.nextLine();

        System.out.println("Credentials valid."); 
        System.out.println("Welcome " + username + "!");
    
    }
}
