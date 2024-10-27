package main; 
import java.util.*;

import Printer.*;

public class Runner {

	public static void main(String[] args) {
	
		
		Scanner scn = new Scanner(System.in);
		
		Person person = new Person("Emman","Espena","Legaspi St", 'M',20);
		
		
		System.out.print("Please enter a first name: ");
		String firstName = scn.nextLine();
		
		System.out.print("Please enter a last name: ");
		String lastName= scn.nextLine();
		
		System.out.print("Please enter a address: ");
		String address = scn.nextLine();
		
		System.out.print("Please enter gender: ");
		char sex = scn.next().charAt(0);
		
		System.out.print("Please enter age: ");
		int age = scn.nextInt();
		
		Seller seller = new Seller(firstName,lastName,address,sex,age);
		
		scn.close();
		
		Printer.word("----- SELLER ----- ");
		
		Printer.word(" ");
		
		Printer.word("Name: " + seller.firstName + " " + seller.lastName);
		Printer.word("Address: " + seller.address);
		Printer.word("Sex: " + seller.sex);
		Printer.word("Age: " + seller.age);
	
		
		Printer.word("----- PERSON ----- ");
		Printer.word(" ");
	
		Printer.word("Name: " + person.firstName + " " + person.lastName);
		Printer.word("Address: " + person.address);
		Printer.word("Sex: " + person.sex);
		Printer.word("Age: " + person.age);
		
		Printer.word("Name: " + person.firstName + " " + person.lastName);
		Printer.word("Address: " + person.address);
		Printer.word("Sex: " + person.sex);
		Printer.word("Age: " + person.age);

	}

}
