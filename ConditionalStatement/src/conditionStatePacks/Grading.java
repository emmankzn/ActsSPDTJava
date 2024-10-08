// SPDT Challenge Grading Computing System
package conditionStatePacks;
import java.util.*;
public class Grading {
	
	public static void main(String [] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		double ave,comprog, rizal, sts, biology;
		System.out.print("Enter your Comprg grade: ");
		comprog = scn.nextDouble();
		
		System.out.print("Enter your Rizal grade: ");
		rizal = scn.nextDouble();
		
		System.out.print("Enter your STS grade: ");
		sts = scn.nextDouble();
		
		System.out.print("Enter your Biology grade: ");
		biology = scn.nextDouble();
		
		scn.close();
		
		
		ave = (comprog + rizal + sts + biology) / 4;
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Comprog2  : " + comprog);
		System.out.println("Rizal	  : " + rizal);
		System.out.println("STS       : " + sts);
		System.out.println("Biology   : " + biology);
		System.out.println(" ");
		System.out.println("Average is: " + ave);
		
	
		if(ave > 100) {
			System.out.println("Invalid Grade");
		}else if(ave >= 98 && ave <= 99){
			System.out.println("With Highest Honor");
		}else if (ave >= 95 && ave <= 97.99) {
			System.out.println("With High Honor");
		}else if (ave >= 90 && ave <= 94.99) {
			System.out.println("With Honor");
		}else if(ave >= 75 && ave <= 89.99){
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
			System.out.println("Better Luck next Sem!");
		}
		
		scn.close();
		
	}// Method ending Bracket
}// Class ending bracket
