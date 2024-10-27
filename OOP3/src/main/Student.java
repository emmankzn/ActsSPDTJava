package main;

public class Student {
	
	String firstName, lastName, course, section;
	int year;
	float midtermGrade, finalGrade;
	
	Student(String firstName, String lastName, String course, String section, int year, float midtermGrade,float finalGrade){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.section = section;
		this.year = year;
		this.midtermGrade = midtermGrade;
		this.finalGrade = finalGrade;
		
	}
	
	void introduceSelf() {
		System.out.println(" ");
		System.out.println("Name	    : " + firstName + " " + lastName);
		System.out.println("Course	    : " + course);
		System.out.println("Year/Section: " + year +"st" +" / " + section);
		System.out.println(" ");
	}
	
	void evaluateGrade() {
		System.out.println(" ");
		float average = (midtermGrade + finalGrade) / 2;
		
		if(average >= 100) {
			System.out.println("Name: " + firstName + " " + lastName);
			System.out.println("Average: " + average + " Invalid Grade");
		}else if(average >= 98)  {
			System.out.println("Name: " + firstName + " " + lastName);
			System.out.println("Average: " + average +" With Higest Honors");
		}else if (average >= 95) {
			System.out.println("Name: " + firstName + " " + lastName);
			System.out.println("Average: " + average +" With High Honors");
		}else if (average >= 90) {
			System.out.println("Name: " + firstName + " " + lastName);
			System.out.println("Average: " + average +" With Honors");
		}else if (average >= 75) {
			System.out.println("Name: " + firstName + " " + lastName);
			System.out.println("Average: " + average +" Passed");
		}else {
			System.out.println("Name: " + firstName + " " + lastName);
			System.out.println("Average: " + average +" Failed");
		}
		System.out.println(" ");
	
	}
	
	

}
