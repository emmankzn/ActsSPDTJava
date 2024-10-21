package main;
import mathOperators.*;
import printer.*;

public class Runner {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Printer.word(" ");
		
		Printer.word("The Sum is: " + Arithmetic.add(10,5));
		Printer.word("The Difference is: " + Arithmetic.minus(3, 2));
		Printer.word("The Product is: " + Arithmetic.multiply(5, 3));
		Printer.word("The Quotient is: " + Arithmetic.division(4, 20));
		Printer.word("The Remainder is: " + Arithmetic.modulo(3, 50));
		
		Printer.word(" ");
		
		
		Printer.word("This is the value of pi: " + Constant.pi);
		
		
		
	}// Runner Method

	
}// Class 


