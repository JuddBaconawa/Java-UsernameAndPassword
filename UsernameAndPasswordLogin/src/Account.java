//packages


//imports
import java.util.ArrayList;

//Account class
public class Account {

	//ArrayList for accounts to be populated in
	ArrayList <Account> account = new ArrayList<>();
	
	//declaration/initialization of an Account's attributes
	private String username;
	private char[] password;
	private int userId; //TBA

	//used to add the users credentials for logging in, must be set to void, cant be static
	public void initializeUsers() {
		account.add(new Account("admin", "password01")); //add(new Account) specifies which ArrayList and that it is new
		account.add(new Account("user01", "password01"));
	}

	//account method
	public Account(String username, String password) {

		//sets the username used
		this.username = username;
		this.password = password.toCharArray(); //changed from password to password.toCharArray()

	}

	//username getter
	public static String getUsername() {
		return username;
	}

	//password getter
	public char[] getPassword() {
		return password;
	}



}
