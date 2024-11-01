package simple_inventory;

public class Meat{

	String type;
	int price;
		
	Meat(String type, int price){
			
		this.type = type;
		this.price = price;
			
	}

	void show() {
		
		System.out.println("Name  : " + type);
		System.out.println("Price : $" + price);
		
	}
}
