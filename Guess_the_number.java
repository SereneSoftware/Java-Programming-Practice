import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int correctAnswer = 4;
		int guess = 3;
	Scanner sc = new Scanner(System.in);
	while (guess != correctAnswer) {
	    System.out.println("Guess the number?!");
	    guess = sc.nextInt();
	    if (guess != correctAnswer) {
	        System.out.println("Try Again.");
	    }
	}
	System.out.println("You Guessed Right!!");
	}
}