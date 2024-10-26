package main;

public class EasyEnemy extends Enemy{

	
		EasyEnemy(){
			
			 name = "Morgan";
			 hp = 50;
			 lvl = 10;
		}
	
	
		void dialog() {
			System.out.println("I am " + name + " ruler of land");
			
		}
		
		
}
