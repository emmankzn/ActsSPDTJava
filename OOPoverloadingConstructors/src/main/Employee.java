package main;

public class Employee {

	 String firstName, lastName;
	 String title, address, sex;
	 int age;
	
	 
	 // Default Employee 
	Employee(){
		
		firstName = "N/A";
		lastName = "N/A";
		title = "N/A";
		address = "N/A";
		sex = "N/A";
		age = 0;
		
	}
	
	
	Employee(String firstName, String lastName, String title){
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		address = "N/A";
		sex = "N/A";
		age = 0;
	}
	
	
	Employee(String firstName, String lastName, String title, String address, String sex, int age){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.address = address;
		this.sex = sex;
		this.age = age;
	}
	
	
}
