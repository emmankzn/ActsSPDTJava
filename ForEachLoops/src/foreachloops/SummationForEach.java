package foreachloops;

public class SummationForEach {

	public static void main(String[] args) {

		
		int numbers[] = {5,10,15,20,25,30,35,40,90,100,123,123,43,31,435,70,34,68,92,1};
		int sum = 0;

		for(int number:numbers) {

			sum += number;

		}	// for each

			System.out.println("The sum is: " + sum);		
		
	}	// Main method
	
}	// Class
