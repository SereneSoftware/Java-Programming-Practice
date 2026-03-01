import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double total = 0;
		String[] subjects = {"Hindi", "English Language","English Literature", "Mathematics","Physics", "Chemistry","Biology", "Computer", "Geography ", "History/Civics"};
		for(int a = 0; a < subjects.length; a++) {
		System.out.println("Enter the marks for your subject " + subjects[a]+ ":");
		double marks = input.nextDouble();
		total += marks;
		}
		double average = total / 10.0;
		System.out.println("Your total marks: " + total);
		System.out.println("Your average marks: " + average);
	}
}