package main;
import printer.*;

public class Runner {
	public static void main(String[] args) {
		
		
		Person person = new Person("Emman", "Male", 20);
		Toddler toddler = new Toddler("Panther", "Male", 1,"Am Am");
		Kid kid = new Kid("Shadow","Female",10,"Burger",6);
		
		
		Person toddler1 = new Toddler("Gray", "Female", 3,"Marie");

		toddler1.checkStatus();
		person.checkStatus();
		toddler.checkStatus();
		
		
		kid.checkStatus();
//		kid.gradeLevel();
		
		
		
	}

}
