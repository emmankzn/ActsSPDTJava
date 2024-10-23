package main;
import printer.*;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		User user = new User(001,"Kaizen03","Emman","Espena");
		
		System.out.print("Please Enter new name: ");
		user.setlastName("Espeña");

		Printer.word("user id: " + user.getUserId());
		Printer.word("username: " + user.getuserName());
		Printer.word("Name: " + user.getfirstName() + " " + user.getlastName());
		
		
	
	}

}
