package switchPacks;
import java.util.*;
public class SwitchActs {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int month,day,year;
		
		System.out.print("Please Enter a Month: ");
		month = scn.nextInt();
		
		switch(month) {
		case 1:
			System.out.print("Please Enter a Day: ");
			day = scn.nextInt();
			System.out.print("Please Enter a year: ");
			year = scn.nextInt();
			System.out.println("  ");
			if(day <= 31) {
				System.out.println("January " + day+"," +" " +year);
			}else {
				System.out.println("Invalid day");
			}
			break;
			
		case 2:
			System.out.print("Please Enter a Day: ");
			day = scn.nextInt();
			System.out.print("Please Enter a year: ");
			year = scn.nextInt();
			System.out.println("  ");
			if(day <= 31) {
				System.out.println("February " + day+"," +" " +year);
			}else {
				System.out.println("Invalid day");
			}
			break;
		case 3:
			System.out.print("Please Enter a Day: ");
			day = scn.nextInt();
			System.out.print("Please Enter a year: ");
			year = scn.nextInt();
			System.out.println("  ");
			if(day <= 31) {
				System.out.println("March " + day+"," +" " +year);
			}else {
				System.out.println("Invalid day");
			}
			break;
			
		case 4:
			System.out.print("Please Enter a Day: ");
			day = scn.nextInt();
			System.out.print("Please Enter a year: ");
			year = scn.nextInt();
			System.out.println("  ");
			if(day <= 31) {
				System.out.println("April " + day+"," +" " +year);
			}else {
				System.out.println("Invalid day");
			}
			break;
			
		case 5:
			System.out.print("Please Enter a Day: ");
			day = scn.nextInt();
			System.out.print("Please Enter a year: ");
			year = scn.nextInt();
			System.out.println("  ");
			if(day <= 31) {
				System.out.println("May " + day+"," +" " +year);
			}else {
				System.out.println("Invalid day");
			}
			break;
			
		case 6:
			System.out.print("Please Enter a Day: ");
			day = scn.nextInt();
			System.out.print("Please Enter a year: ");
			year = scn.nextInt();
			System.out.println("  ");
			if(day <= 31) {
				System.out.println("June " + day+"," +" " +year);
			}else {
				System.out.println("Invalid day");
			}
			break;
		case 7:
			System.out.print("Please Enter a Day: ");
			day = scn.nextInt();
			System.out.print("Please Enter a year: ");
			year = scn.nextInt();
			System.out.println("  ");
			if(day <= 31) {
				System.out.println("July " + day+"," +" " +year);
			}else {
				System.out.println("Invalid day");
			}
			break;
		case 8:
			System.out.print("Please Enter a Day: ");
			day = scn.nextInt();
			System.out.print("Please Enter a year: ");
			year = scn.nextInt();
			System.out.println("  ");
			if(day <= 31) {
				System.out.println("August " + day+"," +" " +year);
			}else {
				System.out.println("Invalid day");
			}
			break;
		case 9:
			System.out.print("Please Enter a Day: ");
			day = scn.nextInt();
			System.out.print("Please Enter a year: ");
			year = scn.nextInt();
			System.out.println("  ");
			if(day <= 31) {
				System.out.println("September " + day+"," +" " +year);
			}else {
				System.out.println("Invalid day");
			}
			break;
		case 10:
			System.out.print("Please Enter a Day: ");
			day = scn.nextInt();
			System.out.print("Please Enter a year: ");
			year = scn.nextInt();
			System.out.println("  ");
			if(day <= 31) {
				System.out.println("October " + day+"," +" " +year);
			}else {
				System.out.println("Invalid day");
			}
			break;
		case 11:
			System.out.print("Please Enter a Day: ");
			day = scn.nextInt();
			System.out.print("Please Enter a year: ");
			year = scn.nextInt();
			System.out.println("  ");
			if(day <= 31) {
				System.out.println("November " + day+"," +" " +year);
			}else {
				System.out.println("Invalid day");
			}
			break;
		case 12:
			System.out.print("Please Enter a Day: ");
			day = scn.nextInt();
			System.out.print("Please Enter a year: ");
			year = scn.nextInt();
			System.out.println("  ");
			
			if(day <= 31) {
				System.out.println("December " + day+"," +" " +year);
			}else {
				System.out.println("Invalid day");
			}
			break;
		default:
			System.out.println("Invalid Month!");
		}// Ending Bracket Switch
	}// Main Method ending Bracket
}// Class ending bracket
