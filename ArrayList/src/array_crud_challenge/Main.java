package array_crud_challenge;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String firstName, lastName;
		String course;
		char section;
		int year;
		boolean isChoice = false;

		ArrayList<Student> students = new ArrayList<Student>();

		System.out.println("Welcome to my Student Registration");
	
		
		do {
			System.out.println();
			System.out.println();

			System.out.println("-- Student # " + (students.size()+1));
			System.out.print("Enter first name : ");
			firstName = scn.nextLine();
			
			System.out.print("Enter last name  : ");
			lastName = scn.nextLine();
			
			System.out.print("Enter course     : ");
			course = scn.nextLine();
			
			System.out.print("Enter section    : ");
			section = scn.next().charAt(0);
			
			System.out.print("Enter year       : ");
			year = scn.nextInt();
			scn.nextLine();
			
			System.out.println();
			System.out.println();
			
			students.add(new Student(firstName, lastName,course,section,year));
			
			System.out.print(" `1` to continue \n '0' to not continue  \nDo you want to cotinue ? ");
			int choice = scn.nextInt();
			scn.nextLine();
			
			if(choice == 0) {
				
				System.out.println();
				System.out.println("--- THANK YOU! ---");
				System.out.println();
				isChoice = true;
				break;	
				
			}
			
			
		}while(!isChoice);
		
		scn.close();
		
		System.out.println("This students successfuly REGISTERED");
		
		System.out.println("Total: " + students.size());
		
		for (int i = 0 ; i < students.size() ; i++) {
			
			System.out.println();
			students.get(i).introduceSelf();
			
		}
		

	}// Main Method

}// Main Class
