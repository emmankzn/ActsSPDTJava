package arryofobj_challenge;

public class Student {
	
	private String firstName, lastName;
	private String course;
	private char section;
	private int year;
	
	
	Student(String firstName, String lastName, String course, char section, int year){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.section = section;
		this.year = year;
		
	}
	
	void introduceSeld() {
		
		
		System.out.println("Full name    : " + firstName + " " + lastName);
		System.out.println("Crse/Yr./Sec : " + course + " - " + year + section);
		System.out.println();
	}
	
	
	
	
}
