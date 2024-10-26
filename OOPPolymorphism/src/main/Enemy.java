package main;

public class Enemy {
	
	
	String name;
	int hp;
	int lvl;
	
	
	void dialog() {
		System.out.println("Please Override Me.");
	}
	
	void showStatus() {
		
		System.out.println("Name  : " + name);
		System.out.println("HP    : " + hp);
		System.out.println("level : " + lvl);
		
		
	}

}
