package main;

import users.UserManager;
import java.io.Console;

public class LoginSystem{
	
	private static String enteredPassword;
	private static String enteredUsername;
	
	// Takes user input
	public static void takeInput(){
		Console console = System.console();
		
		System.out.print("Enter the username: ");
		enteredUsername = console.readLine();
		
		System.out.print("Enter your password: ");
		enteredPassword = String.valueOf(console.readPassword());
	}
	
	public static void main(String[] args){
		
		LoginSystem.takeInput();
		
		UserManager userManager = new UserManager();
		UserManager.LoginProcessor loginProcessor = userManager.new LoginProcessor();
		
		if(loginProcessor.authenticate(enteredUsername, enteredPassword)){
			System.out.println("Access Granted.");
		}else{
			System.out.println("Wrong Username or Password.");
		}
	}
}