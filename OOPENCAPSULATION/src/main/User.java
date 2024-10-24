package main;

public class User {
	
	private int userId;
	private String userName;
	private String firstName, lastName;
	
	User(int userId, String userName, String firstName, String lastName){
		
		this.userId = userId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	//------------- Setters--------------
	void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	//------------- Getters--------------	
	int getUserId() {
		return userId;
	}
	
	String getuserName() {
		return userName;
	}
	
	String getfirstName() {
		return firstName;
	}
	
	String getlastName() {
		return lastName;
	}
	
	
	
}
