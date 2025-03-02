//packages


//imports
public class Account {


	
	//declaration/initialization of an Account's attributes
	private String username; //static removed because it makes all credentials share the same value
	private char[] password;
	private int userId; //TBA



	//account method constructor
	public Account(String username, String password, int userId) {

		//sets the username used
		this.username = username; //normal - this.username
		this.password = password.toCharArray(); //changed from password to password.toCharArray()
		this.userId = userId; //just adding now for the future

	}

	//username getter
	public String getUsername() {
		//returns username
		return username;
	}

	//password getter
	public char[] getPassword() {
		//returns password
		return password;
	}

	//userId Getter
	public int getUserId() {
		//returns userId
		return userId;
	}



}
