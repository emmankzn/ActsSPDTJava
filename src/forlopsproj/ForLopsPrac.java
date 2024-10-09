package forlopsproj;

import java.util.*;


 public class ForLopsPrac {
	public static void main(String [] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String names[] ={"Emman","Chan","Ced","Charles","Majs"};
		String search;
			
			System.out.print("Please Enter Name:");
			search = scn.nextLine();
		for(int i = 0; 0 < names.length; i++) {
				
			if(names[i].equalsIgnoreCase(search)) {
				System.out.println("The person you are Looking is: " + names[i]);
				break;
			}else {
				
				System.out.println(names[i]);
			}
			
		}
		
		
	}//	Method End - Bracket
}// Class End - Bracket