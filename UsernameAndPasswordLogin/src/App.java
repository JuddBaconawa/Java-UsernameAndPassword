//packages


//imports
import java.util.ArrayList;
import java.util.Scanner;

//main class titled "App"
public class App {



    //Main method where the main execution of code happens
    public static void main(String[] args) throws Exception {
    

        //scanner initialized
        Scanner scanner = new Scanner(System.in);

        //initialize the user database
        UserService.initializeUsers();
        //must be added to grant the App class direct access to the list of accounts
        ArrayList<Account> account = UserService.getAccounts(); 

        //while statement to loop after the log in or due to invalid credentials/failed login
        while (true) { 


            //prompt to get the user to input a username
            System.out.println("Enter username: ");
            String username = scanner.nextLine(); //

            //prompts the user to input a password
            System.out.println("Enter password");
            String password = scanner.nextLine();

            if (username.isEmpty() || password.isEmpty()) {
                System.out.println("Blank input issue.");
            } else {
            //dispplays if credential is valid
                boolean loggedIn = UserService.login(username, password.toCharArray(), UserService.getAccounts());

                if (loggedIn) {
                    System.out.println("Login Successfull!");
                } else {
                    System.out.println("Credentials not found.");
                }
            }

            //Loop to ask for credentials again - 
            System.out.println("Do you want to continue? (Y/N)");
            String continueResponse = scanner.nextLine();
            
                //checks if the input is either N or n
                if (continueResponse.equalsIgnoreCase("N")) {
                    break;
                }



        }
        scanner.close(); //fore close scanner
    }


}
