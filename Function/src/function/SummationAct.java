package function;

public class SummationAct {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = {1,5,10,15};
		
		int result = summation(numbers);
		
		print("The sum of arrays is: " + result);
		
		
	}// Main Method
	
	static int summation(int numbers[]) {
		int sum = 0;
		
		for(int number:numbers) {
			sum = sum + number;
		}
		
		return sum;
	
	}
	
	static void print(String word) {
		System.out.println(word);
	}

}// Class
