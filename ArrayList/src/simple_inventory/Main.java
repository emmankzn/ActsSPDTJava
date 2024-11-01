package simple_inventory;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		ArrayList<Fruits> fruit = new ArrayList<Fruits>();
		ArrayList<Meat> meat = new ArrayList<Meat>();
		
		String name;
		int price;
		boolean isCntnue = false;
		int x;
	
		System.out.print("Enter a type of product: ");
		String choice = scn.nextLine();
		
		switch(choice) {
		
		case "meat"://----------------- MEAT -------------------------//
			
			System.out.println("--- MEAT PRODUCTS ---");
			System.out.println();
			do {
				
				System.out.println("Product # " + (meat.size()+1));
				System.out.print("Product Name  : ");
				name = scn.nextLine();
				
				System.out.print("Product Price : ");
				price = scn.nextInt();			
				
				System.out.println();
				
				System.out.print("'1' to contienue \n'0' or to no continue \nDo you want to Continue?: ");
				x = scn.nextInt();
				System.out.println();
				System.out.println();
				scn.nextLine();
				
				if(x == 0) {
					
					System.out.println();
					System.out.println();
					System.out.println("Thank you for using!");
					System.out.println();
					System.out.println("This meats Successfuly Add!");
					System.out.println("Total: " + (meat.size()+1));
					System.out.println();
					isCntnue = true;
					
				}// if
				
				meat.add(new Meat(name,price));
				
				
			}while(!isCntnue);
			
			for(int i = 0; i < meat.size() ; i++) {
				
				meat.get(i).show();
				System.out.println();
				
			}// for each

		break;
		
		
		
		case "fruit"://----------------- FRUITS -------------------------//
			
			System.out.println("--- FRUITS PRODUCTS ---");
			System.out.println();
			do {
				
				System.out.println("Product # " + (fruit.size()+1));
				System.out.print("Product Name  : ");
				name = scn.nextLine();
				
				System.out.print("Product Price : ");
				price = scn.nextInt();			
				
				System.out.println();
				
				System.out.print("'1' to contienue \n'0' or to no continue \nDo you want to Continue?: ");
				x = scn.nextInt();
				System.out.println();
				System.out.println();
				scn.nextLine();
				
				if(x == 0) {
					
					System.out.println();
					System.out.println();
					System.out.println("Thank you for using!");
					System.out.println();
					System.out.println("This fruits Successfuly Add!");
					System.out.println("Total: " + (fruit.size()+1));
					System.out.println();
					isCntnue = true;
					
				}// if
				
				fruit.add(new Fruits(name,price));
				
				
			}while(!isCntnue);
			
			for(int i = 0; i < fruit.size() ; i++) {
				
				fruit.get(i).show();
				System.out.println();
				
			}// for each
			
			
		break;
		}// switch 
		
		
		scn.close();
		
		
		
	}// Main Method

}// Main Class
