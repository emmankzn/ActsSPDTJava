package array_crud;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Emman");
		names.add("Cedric");
		names.add("Maria");
		
		// for loop
		for(int i = 0; i < names.size(); i++) {
			
			System.out.println(names.get(i));
			
		}
		
		System.out.println();
		System.out.println();
		
		// for each
		for(String name: names) {
			
			System.out.println(name);
			
		}
		
		System.out.println();
		System.out.println();
		
		// get
		System.out.println(names.get(0));
		// set
		names.set(0, "Emmanuel");
		System.out.println(names.get(0));
		// remove
		names.remove(0);
		System.out.println(names.get(0));
		// Clear 
		names.clear();
		// to check size 
		System.out.println(names.size());
		
		ArrayList<Student> students = new ArrayList<Student>();
	
		students.add(new Student("Emman","BSIT"));
		students.add(new Student("Cedric","BSCS"));
		students.add(new Student("Maria","BSBA"));
		
		
		// for loop
		for(int i = 0; i < students.size(); i++) {
			
			students.get(i).introduction();
			
		}
		System.out.println();
		System.out.println();
		// for each
		for (Student stnd : students) {
			
			stnd.introduction();
			
		}
		
		System.out.println();
		System.out.println();
		
		// get
		students.get(0).introduction();
		// set
		students.set(1, new Student("Lawrence", "BSIT"));
		students.get(1).introduction();
		// remove
		students.remove(0);
		students.get(0).introduction();
		// Clear
		students.clear();
		

		
	}// Main method

}// Main Class