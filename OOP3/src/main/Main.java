package main;
import Printer.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student student = new Student("Emmanuel","Espeña","BSIT","B",1,90.99f,96.99f);
		Student student1 = new Student("Cedric","Nano","BSIT","A",3,94.99f,93.99f);
		Student student2 = new Student("Jaja","Estrellado","HM","A",2,90f,95.99f);
		Printer.word("----- STUDENTS ----- ");
		Printer.word(" ");
		
		student.introduceSelf();
		student.evaluateGrade();
		
		student1.introduceSelf();
		student1.evaluateGrade();
		
	
		student2.introduceSelf();
		student2.evaluateGrade();
		
	}

}
