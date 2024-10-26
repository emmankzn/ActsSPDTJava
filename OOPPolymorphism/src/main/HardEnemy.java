package main;

public class HardEnemy extends Enemy{
	
	
	HardEnemy(){
		 name = "Panther";
		 hp = 250;
		 lvl = 50;
	}
	
	void dialog() {
		
		System.out.println("I am " + name + " underword");
		
		
	}

}
