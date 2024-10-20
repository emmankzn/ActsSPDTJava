package function;

public class MethodWArguWReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = add(10,20);
		int diffirence = subs(20,10);
		int product = multi(5,15);
		int quotient = divi(20,5);
		int modulos = modulo(3,20);
		
		print(" ");
		
		print("The sum is: " + sum);
		print("The difference is: " + diffirence);
		print("The product is: " + product);
		print("The quotient is: " + quotient);
		print("The Modulo is: " + modulos);
		print(" ");
		
	}// Main Method / Function

	// Addition Method/Function
	static int add(int num1, int num2) {
		
		return num1 + num2;
		
	}
	// Subtraction Method/ Function
	static int subs(int num1, int num2) {
		
		return num1 - num2;
	}
	
	// Multiplication Method / Function
	
	static int multi(int num1, int num2) {
		
		return num1 * num2;
		
	}
	
	// Division Method / Function
	
	static int divi(int num1, int num2) {
		
		return num1 / num2;
		
	}
	
	// Modulo Method / Function
	
	static int modulo(int num1, int num2) {
		
		return num1 % num2;
		
	}
	
	
	// Print Method / Function
	static void print(String word ) {
		
		System.out.println(word);
		
	}
	
	
	
	
}// Class
