# UsernameAndPassword
Simple Java program that prompts the user to input a username and password within the command line which is then checked for credential (via .equal) success or fail based
on the built-in parameters (invalid password or empty input box) set on the code.


This is considered an easy-difficulty project to showcase Java skills since it doesn't apply GUI. 2/26/25
The concepts used in this are the import and use of a scanner to take input credentials, if-statements to check for the username and password, or whether the credentials
are false, and while statement to go back to the login page.

The only credentials that can be inputted are "admin" and "password01" or "username01" and "password01".

Three classes are created to organize the code to improve readability and hide how it works from users by cutting it out of Account.java class and adding it 
to the UserService.java class.
