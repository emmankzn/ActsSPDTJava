package forlopsproj;
import java.util.*;
public class ForLop {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String password [] = {"456", "123", "890"};
		String username [] = {"Ced03", "Emman03", "Chan01"};
		
		String usernames;
		String passwords;
		
		boolean isExist = false;
		
		
		System.out.print("Username: ");
		usernames = scn.nextLine();	
		
		System.out.print("Password: ");
		passwords = scn.nextLine();	
		
		for(int i = 0; i < username.length ; i++) {
			
			if(usernames.equals(username[i]) && passwords.equals(password[i])){
				System.out.println(" ");
				isExist = true;
				break;
				
			}		
		}// For Loop
			
			if(isExist) {
				System.out.println("Welcome " + usernames);
			}else {
				System.out.println("Acount: "+ usernames +" NOT FOUND!");
			}
			
			
		}// Main Metho
	} // Class


