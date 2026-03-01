import java.util.Scanner;
public class TicketBooking {
	public static void main(String[] args) {
		Scanner scanner = new
	   Scanner(System.in);
	   System.out.println("Enter your name: ");
	   String name = 
	   scanner.nextLine();
	   System.out.println("Enter your age: ");
	   int age = 
	   scanner.nextInt();
	   System.out.println("Enter number of tickets: ");
	   int tickets = 
	   scanner.nextInt();
	   System.out.println("Booking confirmed!");
	   System.out.println("Name: " + name);
	   System.out.println("Age: " + age);
	   System.out.println("Number of tickets: " + tickets );
	}
}