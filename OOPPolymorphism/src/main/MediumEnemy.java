package main;

public class MediumEnemy extends Enemy{

	MediumEnemy(){
		name = "Skywrath";
		hp = 100;
		lvl = 30;
		
	}
	
	void dialog() {
		
		System.out.println("I am " + name + " ruler of water");
		
		
	}
	
	
}
