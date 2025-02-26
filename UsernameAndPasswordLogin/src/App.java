//packages


//imports
import java.util.Scanner;

//main class titled "App"
public class App {

    //Main method where the main execution of code happens
    public static void main(String[] args) throws Exception {
    

        //scanner initialized
        Scanner scanner = new Scanner(System.in);

        while (true) { 


            //prompt to get the user to input a username
            System.out.println("Enter username: ");
            String username = scanner.nextLine(); //

            System.out.println("Enter password");
            String password = scanner.nextLine();

            System.out.println("Credentials valid."); 
            System.out.println("Welcome " + username + "!");

            //Loop to ask for credentials again - 
            System.out.println("Do you want to continue? (Y/N)");
            String continueResponse = scanner.nextLine();
            
                //checks if the input is either N or n
                if (continueResponse.equalsIgnoreCase("N")) {
                    break;
                }



        }
    
    }
}
