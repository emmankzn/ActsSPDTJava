package test;
import java.util.*;
public class Test {

	public static void main(String [] args) {
			
		Scanner scn = new Scanner(System.in);
			
		String username[] = {"Emman01", "Ced27", "Chan31"};
		String password[] = {"zxc", "qwe", "asd"};
		
		
		String intUsername;
		String intPassword;
		boolean isExist = false;
		
		System.out.print("username: ");
		intUsername = scn.nextLine();
		
		System.out.print("password: ");
		intPassword = scn.nextLine();
		
		System.out.println(" ");
		System.out.println(" ");
		
		scn.close();
		
		for(int i = 0; i < username.length ; i++) {
			if(intUsername.equals(username[i]) && intPassword.equals(password[i])) {
				isExist = true;
					break;
				}
		
		}// for loop

			if(isExist) {
				System.out.println("Welcome user " + intUsername);
			} else {
				System.out.println("Account " + intUsername + " is not Found");
			}
			
	}
}
