package nestedforloop;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 5; i++) {
			
			
			for(int x = 0; x < 5; x++) {
				
				System.out.println(i + " " + x);
				
			}// for loop
			
			System.out.println(" ");
		}// for loop
		
		
		
		String users[][] = {
				{"Emman", "em030304man"},
				{"Chan", "channyzxc"},
				{"Ced", "ced456"},
				{"Majo", "majo1435"},
				{"Charles","charzu"},
				{"James", "jamiz"}
				
		}; // 2D array
		
		for(int row = 0 ; row < users.length; row ++) {
			
			for (int col = 0; col < users[row].length; col ++) {
				
				System.out.println(users[row][col]);
				
			}// inner Loop
			
			System.out.println(" ");
			
		}// Outer Loop
		
		
		
	}// Method

}// Class
