package array_crud;

public class Student {

	String name, course;
	
	Student(String name, String course){
		
		this.name = name;
		this.course = course;
		
	}
	
	void introduction() {
		System.out.println();
		System.out.println("My name is " + name + " currently taking " + course);
	}
	
}
