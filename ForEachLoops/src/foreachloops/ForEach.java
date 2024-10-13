package foreachloops;
import java.util.*;
public class ForEach {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		String names[]= {"Emman","Ced","Chan","Majs","Charles"};
		int prices[] = {5,10,15,20,25,30,35,40};
		
		String search;
		boolean isExist = false;		
		System.out.print("Searching for: ");
		search = scn.nextLine();
		
		scn.close();
		
		System.out.println(" ");
		
		for(String name: names) {
			
			if(name.equalsIgnoreCase(search)) {
				isExist = true;
				break;
				
			} // if else		
			
		} // for each
		
		if(isExist) {
			System.out.println("Name : " + search + " is founded");
		}else {
			System.out.println("Name : " + search + " is not found");
		}
		
		
		System.out.println(" ");	
		
		for(int price: prices) {
			
			
			if(price == 25) {
				System.out.println(price);
				break;
				
				
			}// if else

		}// for each		
		
		
	}// Method

}// Class
