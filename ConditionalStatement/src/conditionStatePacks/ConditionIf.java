package conditionStatePacks;
import java.util.*;	
public class ConditionIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		int age;
		int age2;
		int age3;
		boolean haveLicense = true;
		
		// If 
		System.out.println("--- If ---");
		System.out.println(" ");
		System.out.print("Please enter your Age: ");
		age2 = scn.nextInt();
		if(age2 >= 13) {
			System.out.println("Congrats You are a Teenager");
		}
		System.out.println(" ");
		// If Else
		System.out.println("--- If Else ---");
		System.out.println(" ");
		System.out.print("Please enter your Age: ");
		age = scn.nextInt();
		
		if (age >= 18){
			System.out.println("Adult!");
		}else {
			System.out.println("Minor");	
		}
		System.out.println(" ");
		
		// If else if
		System.out.println("--- If Else If ---");
		System.out.println(" ");
		System.out.print("Please enter your Age: ");
		age3 = scn.nextInt();
		if (age3 >= 18){
			System.out.println("Adult!");
		}else if(age3 >= 13){
			System.out.println("Teenager!");	
		}else {
			System.out.println("Kid!");
		}
		System.out.println(" ");
		
		// Nested If
		System.out.println("--- Nested If ---");
		System.out.println(" ");
		System.out.print("Please enter your Age: ");
		age3 = scn.nextInt();
		
		if (age3 >= 18){
			if(haveLicense) {
				System.out.println("Adult!, You can take your License!");
			}
		}else if(age3 >= 13){
			System.out.println("Teenager!");	
		}else {
			System.out.println("Kid!");
		}
		

	}

}
 