package simple_inventory;

public class Fruits {
	
	String type;
	int price;
	
	
	Fruits(String type, int price){
		
		this.type = type;
		this.price = price;
		
	}
	
	void show() {
		
		System.out.println("Name  : " + type);
		System.out.println("Price : $" + price );
		
	}
}
