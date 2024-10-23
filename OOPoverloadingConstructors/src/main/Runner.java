package main;
import printer.*;
public class Runner {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Emman","Espena","Programmer","148 Legaspi","Male",20);
		Employee e = new Employee("Panther","Cutie","Bantay"); 
		
		
		Printer.word(" " + employee.firstName);
		Printer.word(" " + employee.lastName);
		Printer.word(" " + employee.title);
		Printer.word(" " + employee.address);
		Printer.word(" " + employee.sex);
		Printer.word(" " + employee.age);
		
		Printer.word(" ");
		
		Printer.word(" " + e.firstName);
		Printer.word(" " + e.lastName);
		Printer.word(" " + e.title);
		Printer.word(" " + e.age);
		Printer.word(" " + e.sex);
		Printer.word(" " + e.address);
	}

}
