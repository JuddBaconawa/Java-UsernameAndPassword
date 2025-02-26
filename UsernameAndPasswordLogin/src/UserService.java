
import java.util.ArrayList;
import java.util.Arrays;

//package

//import

//main class
public class UserService {
	
	//login method which checks for the username and password credentials
	public static boolean login(String username, char[] password, ArrayList<Account> account) {
		for (Account accounts : account) {

			//check matches with an if statements
			//employs the getters to match the inputed username and password to return true or false
			if (account.getUsername().equals(username) && Arrays.equals(account.getPassword(), password)) {
				//true
				return true;
			}
		}
		//false result
		return false;
	}

	//used to add the users credentials for logging in, must be set to void, cant be static
	public static void initializeUsers() {

		//ArrayList for accounts to be populated in
		ArrayList <Account> account = new ArrayList<>();
	
	
			account.add(new Account("admin", "password01", 000001)); //add(new Account) specifies which ArrayList and that it is new
			account.add(new Account("user01", "password01", 000002));
			//userId added on both add -
		}


}
