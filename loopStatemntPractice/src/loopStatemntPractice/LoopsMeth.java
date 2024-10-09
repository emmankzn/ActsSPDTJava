package loopStatemntPractice;
import java.util.*;
public class LoopsMeth {

	public static void main(String[] args) {
		// ------- While Loop
		
		int i = 0;
		
		while(i < 5) {
			System.out.println("Hello World");
			i++;
		}
		
		System.out.println(" ");
		String names[] = {"Emman","Ced","Chan","Majs","Shadow"};
		int p = 0;
		while (p < names.length) {
			System.out.println(names[p]);
			p++;
		}
		
		System.out.println(" ");
		//------- Do While Loop
		
		do {
			System.out.println("This is Do while");
			i++;
		}while(false);
		System.out.println(" ");
		
		Scanner scn = new Scanner(System.in);
		String search;
		
		System.out.print("Please Enter the name: ");
		search= scn.nextLine();
		
		String person[] = {"Emman","Ced","Chan","Majs","Shadow"};
		int index = 0;
		
		while(index < person.length) {
			if(person[index].equalsIgnoreCase(search)) {
				System.out.println("We Found you: " + person[index]);
				break;
			} else {
				System.out.println(person[index]);
			}
			index++;
		}
		
		
	}// Method ending Bracket
}// Class ending Bracket
