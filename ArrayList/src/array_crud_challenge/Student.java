package array_crud_challenge;

public class Student {
	
	
	String firstName, lastName;
	String course;
	char section;
	int year;

	Student(String firstName, String lastName, String course, char section, int year){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.section = section;
		this.year = year;
		
	}
	
	
	void introduceSelf() {
		
		System.out.println("Full name  : " + firstName + " " + lastName);
		System.out.println("Crs/Yr/Sec : " + course + " - " + year + section);
		System.out.println();
	}
}
