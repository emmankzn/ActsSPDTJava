package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Enemy ee = new EasyEnemy();
		Enemy me = new MediumEnemy();
		Enemy he = new HardEnemy();
		
		
		
		
		ee.showStatus();
		ee.dialog();
		
			System.out.println(" ");
			
		me.showStatus();
		me.dialog();
		
			System.out.println(" ");
	
		he.showStatus();
		he.dialog();
	}

}
