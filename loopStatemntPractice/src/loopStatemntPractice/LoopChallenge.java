package loopStatemntPractice;
import java.util.*;
public class LoopChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		int live = 3;
		
		int ans ;
		
	
		while(live > 0) {
			System.out.print("What is 10 + 10: ");
			ans = scn.nextInt();
			
			
			if(ans == 20) {
				System.out.println("You Won");
				
				break;
			}else {
				System.out.println(" ");
				System.out.println("Wrong, try Again");
				System.out.println(" ");
			}
			
			live--;
			System.out.println("Current Lives: " + live);
			System.out.println(" ");
			if(live == 0) {
				System.out.println("You loss you don't have live");
			}
			
		}
		
		scn.close();
		
		

	}// method ending Bracket

}// Class ending bracket
