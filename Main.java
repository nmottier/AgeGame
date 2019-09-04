
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Player 1, how old do you think player 2 is? ");                                   
		int guessedAge = scnr.nextInt(); 
		System.out.print("Player 2, how old are you? "); 
		int actualAge = scnr.nextInt();
		int diff = actualAge - guessedAge;
		if(guessedAge == actualAge) {
			System.out.print("Player 1 wins");
		}
		else if (diff == 2 || diff == -2) {
			System.out.print("Player 1 wins");
		}
		else {
			System.out.print("Player 2 wins");
		}
	}
}
		



