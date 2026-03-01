import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password = "secret";
		String userInput = "";
		while (!userInput.equals(password)) {
		    System.out.println("Enter you password: ");
		    userInput = sc.nextLine();
		    if (!userInput.equals(password)) {
		        System.out.println("Incorrect password!");
		    }
		  }
		  System.out.println ("Password Accepted.");
	}
}