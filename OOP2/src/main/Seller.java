package main;

public class Seller {
	

	String firstName;
	String lastName;
	String address;
	char sex;
	int age;
	
	
	Seller(String firstName, String lastName, String address, char sex, int age){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.sex = sex;
		this.age = age;
		
		System.out.println(" ");
		System.out.println(firstName + " " + lastName + " Created" );
		System.out.println(" ");
	}

}
