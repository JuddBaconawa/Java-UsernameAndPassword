
import java.util.ArrayList;
import java.util.Arrays;

//package

//import

//main class
public class UserService {

		//ArrayList for accounts to be populated in
		static ArrayList <Account> accounts = new ArrayList<>();
		
			//used to add the users credentials for logging in, must be set to void, cant be static
			public static void initializeUsers() {
				accounts.add(new Account("admin", "password01", 000001));
				accounts.add(new Account("user01", "password01", 000002));
	}
	
	//login method which checks for the username and password credentials
	public static boolean login(String username, char[] password, ArrayList<Account> account) {
		for (Account accounts : account) {

			//check matches with an if statements
			//employs the getters to match the inputed username and password to return true or false
			if (accounts.getUsername().equals(username) && Arrays.equals(accounts.getPassword(), password)) {
				//true
				return true;
			}
		}
		//false result
		return false;
	}



	
		public static ArrayList<Account> getAccounts() {
			return accounts;
		}


}
