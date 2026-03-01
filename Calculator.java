import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hello! Your Simple Calculator speaking! let's enter digits to let me help you~ ♡");
		System.out.println("Enter your first digit~");
		int num1 = input.nextInt();
		System.out.println("Okay. Enter your second number~");
		int num2 = input.nextInt();
		System.out.println("Now, Let's choose what operator you want to solve!");
		System.out.println("1. Addition (+)");
		System.out.println("2. Subtraction (-)");
		System.out.println("3. Multiplication (*)");
		System.out.println("4. Division (/)");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
		System.out.println("Result: " + (num1 + num2));
		break;
		case 2:
		System.out.println("Result: " + (num1 - num2));
		break;
		case 3:
		System.out.println("Result: " + (num1 * num2));
		break;
		case 4:
		System.out.println("Result: " + (num1 / num2));
		break;
		}
		input.close();
	}
}