import java.util.Scanner;
public class Juiceshop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
          System.out.println("Heya! Welcome to our Juice Shop! ♡");
          System.out.println("Enter your choice to proceed!");
          System.out.println("1. Orange Juice");
          System.out.println("2. Mango Juice");
          System.out.println("3. Apple Juice");
          int choice = input.nextInt();
          switch (choice) {
              case 1:
              System.out.println("You have chosen Orange Juice 🍊 ");
              break;
              case 2:
              System.out.println("You have chosen Mango Juice 🥭");
              break;
              case 3:
              System.out.println("You have chosen Apple Juice 🍎 ");
              break;
              default:
              System.out.println("Invalid choice! Please try again.");
          }
              input.close();
		}
}