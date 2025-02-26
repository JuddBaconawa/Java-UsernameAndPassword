
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
			if(Account.getUsername().equals(username) && Arrays.equals(Account.getPassword(), password)) {
				return true;
			}
		}

		return false;
	}


}
