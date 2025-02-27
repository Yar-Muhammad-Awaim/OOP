package users;

import util.PasswordValidator;

public class UserManager{
	private static final String storedUsername = new String("awaim");
	private static final String storedPassword = new String("Awaim@1234");
	
	public class LoginProcessor{
		
		public static boolean authenticate(String enteredUsername, String enteredPasswrod){
			if(PasswordValidator.isValid(storedPassword)){
				if(enteredUsername.equals(storedUsername) && enteredPasswrod.equals(storedPassword)){
					return true;
				}
			}
			return false;
		}
	}
}