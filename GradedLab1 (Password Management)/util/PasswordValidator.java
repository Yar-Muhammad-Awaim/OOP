package util;

import main.LoginSystem;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PasswordValidator{
	
	// Validates stored password
	public static boolean isValid(String storedPassword){
		
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*-_]).{8,}$";  // Regular Expression
		Pattern pattern = Pattern.compile(regex);  // Compiling of regex into pattern
		Matcher matcher = pattern.matcher(storedPassword);  // Matcher object creation for stored password
		
		// Returns true if password matches all of the criterias
		if(matcher.matches()){
			return true;
		}else{
			return false;
		}
	}
	
}