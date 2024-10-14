// 2D array

package array2d;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers [][] = new int[4][3];
		
		String users[][]= {
				
				{"Emman","zxc"},
				{"Ced","qwe"},
				{"Chan","tyu"},
				{"Majs","asd"},
				
		}; // 2d Array with value
		
		numbers [2][1] = 50;
		
		System.out.println(numbers[2][1]);
		
		users[0][0]= "Charles";
			System.out.println(users[0][0] + " " + users[0][1]);
		

		
	}// Method
}//	Class

