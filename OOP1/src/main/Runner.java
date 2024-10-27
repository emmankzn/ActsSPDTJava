package main;
import java.util.*;

import Printer.*;

public class Runner {

	public static void main(String [] args) {
		
		
		Scanner scn = new Scanner(System.in);
		Person customer = new Person();
		Person seller = new Person();
		Product product = new Product();
		
		seller.firstName = "Eleon";
		seller.lastName = "Musk";
		seller.address = "123 Montalban Rizal";
		seller.sex = 'M';
		seller.age = 34;
		
		
		System.out.print("Customer First Name: ");
		customer.firstName = scn.nextLine();
		
		System.out.print("Customer Last Name: ");
		customer.lastName = scn.nextLine();
		
		System.out.print("Customer Address: ");
		customer.address = scn.nextLine();
		
		System.out.print("Customer Gender: ");
		customer.sex = scn.next().charAt(0);
		
		System.out.print("Customer age: ");
		customer.age = scn.nextInt();
		
		Printer.word(" ");
		Printer.word(" ");
		
		scn.nextLine();
		
		
		System.out.print("Please enter the Product Name: ");
		product.name = scn.nextLine();
		
		System.out.print("Please enter the Product Brand: ");
		product.brand = scn.nextLine();
		
		System.out.print("Please enter the Product Category: ");
		product.category = scn.nextLine();
		
		System.out.print("Please enter the Product Price: ");
		product.price = scn.nextInt();
		
		System.out.print("Please enter the Product Quantity: ");
		product.quantity = scn.nextInt();
		
		
		Printer.word(" ");
		Printer.word(" ");
		

		scn.close();
	
		
		Printer.word("----- CUSTOMER -----");
		
		Printer.word(" ");
		Printer.word("Name      : " + customer.firstName + " " + customer.lastName);
		Printer.word("Sex       : " + customer.sex);
		Printer.word("Age       : " + customer.age);
		Printer.word("Address   : " + customer.address);
		
		Printer.word(" ");
		Printer.word(" ");

		Printer.word("----- SELLER -----");
		
		Printer.word(" ");
		Printer.word("Name      : " + seller.firstName + " " + seller.lastName);
		Printer.word("Sex       : " + seller.sex);
		Printer.word("Age       : " + seller.age);
		Printer.word("Address   : " + seller.address);
		
		Printer.word(" ");
		Printer.word(" ");
		
		
		
		Printer.word("----- PRODUCT -----");
		Printer.word(" ");
		Printer.word("Product   : " + product.name);
		Printer.word("Brand     : " + product.brand);
		Printer.word("Catergory : " + product.category);
		Printer.word(" ");
		Printer.word("Price     : " + product.price);
		Printer.word("Quantity  : " + product.quantity);
		
		
		
	}// Main Method
}// Class
