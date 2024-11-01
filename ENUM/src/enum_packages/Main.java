package enum_packages;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter a level: ");
		AILevel level = AILevel.HARD;
	
		
		if(level == AILevel.EASY) {
			System.out.println("For Beginner");
		}else if (level == AILevel.MEDIUM) {
			System.out.println("For average");
		}else {
			System.out.println("For expert");
		}
		
		
		switch(level) {
		case EASY:
			System.out.println("For Beginner");
		break;
		
		case MEDIUM:
			System.out.println("For Average");
		break;
		case HARD:
			System.out.println("For Expert");
		break;
		
		}
		
		USCurrency money = USCurrency.QUARTER;
		
		System.out.println(money.value);
		

	}// Main Method

}// Class
