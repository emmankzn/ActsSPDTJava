package arryofobj_challenge;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		
		Scanner scn = new Scanner(System.in);

		 String firstName, lastName;
		 String course;
		 char section;
		 int year;

		 
		 System.out.print("Enter how many student to be register: ");
		 int size = scn.nextInt();
		 
		 System.out.println();
		 System.out.println();
		 
		 Student students[] = new Student[size];
		 scn.nextLine();
		 
		 
		 		for(int i = 0; i < students.length; i++) {
		 				
		 			System.out.println("Student #" + (i+1));
		 			System.out.println();
		 			
		 			
					 System.out.print("First Name : ");
					 firstName = scn.nextLine();
					
					 System.out.print("Last Name  : ");
					 lastName = scn.nextLine();
					 
					 System.out.print("Course     : ");
					 course = scn.nextLine();
					
					 System.out.print("Section    : ");
					 section = scn.nextLine().charAt(0);
					 
					 System.out.print("Year level : ");
					 year = scn.nextInt();
					 scn.nextLine();
					 
					 System.out.println();
					 System.out.println();	
					 
					 students[i] = new Student(firstName,lastName,course,section,year);
		 		 		
		 		}// For loop
		 		
		 		System.out.println("This "+ size +" Students successfuly REGISTERED!");
	 			System.out.println();
	 			System.out.println();
	 			
		 		for (Student stdnt: students) {
	
		 			stdnt.introduceSeld();
		 			
		 		}// For Each loop

		 		scn.close();

	}// Main Method

}// Class
