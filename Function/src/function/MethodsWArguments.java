package function;

public class MethodsWArguments {

	// GLOBAl Variable
	static String name = "Emman";
	
	public static void main(String[] args) {
	

		addition(20, 15);


		System.out.println();
		
		print("Hello, " + name);		
		
		System.out.println();
		
		info ("Emman",20,"148 Payatas B Quezon City");
		
		Multiplication(5,20);
		

	} // Main Method
	
	// Methods with ARGUMENTS
	
		static void addition(int num1, int num2) {
			
			System.out.println(num1 + num2);
		}
		
		static void print(String word) {
			System.out.println(word);
		}
		
		static void info(String name, int age, String Add) {
			
			print("Hello, " + name);
			print("You are " + " years old");
			print("You live in " + Add);
			print (" ");
			
			System.out.println("Hello my name is, " + name + " and Im "+ age + " years old and i live in "+ Add);
			
			print (" ");
		}
		
		
		static void Multiplication(int num1, int num2) {
			
			
			
			print("The Product is: " + num1 * num2);
			
		}
		
		

} // Class
