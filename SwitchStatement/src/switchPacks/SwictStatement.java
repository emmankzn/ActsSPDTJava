package switchPacks;
import java.util.*;

public class SwictStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		char grade;
		
		System.out.print("Please Enter a Grade: ");
		grade = scn.next().charAt(0);
		scn.close();
		switch(grade) {
		case 'A':
			System.out.println("Grade: " + grade);
			System.out.println("With High Honor");
			break;
	
		case 'B':
			System.out.println("Grade: " + grade);
			System.out.print("with Honor");
			break;
	
		case 'C':
			System.out.println("Grade: " + grade);
			System.out.println("Passed");
			break;
			
		case 'F':
			System.out.println("Grade: " + grade);
			System.out.println("Failed");
			break;
			
		default:
			System.out.println("Invalid Input Please try again");
		}
	
	}// Method ending Bracket
}// Class ending Bracket
