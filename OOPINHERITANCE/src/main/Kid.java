package main;

public class Kid extends Toddler {

	int gradelevel;
	
	Kid(String name,String sex, int age, String favoriteFood,int gradelevel){
		super(name,sex,age,favoriteFood);
		
		
		this.gradelevel = gradelevel;
	}
	
	void checkStatus() {
		super.checkStatus();
		System.out.println("My grade level is: " + gradelevel) ;
	}
	
//	void gradeLevel(){
//		System.out.println("My grade level is: " + gradelevel) ;
//		
//	}
	
}
