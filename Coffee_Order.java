import java.util.Scanner;
public class CoffeeOrder {
	public static void main(String[] args) {
		Scanner scanner = new
		Scanner(System.in);
		System.out.println("Welcome to our Lofi Coffee Shop!! ♡ Please enter your name~");
		String name = scanner.nextLine();
		System.out.println("Hi " + name + "! Let's order your coffee mood for today");
		System.out.println("1. Espresso - ₹320");
		System.out.println("2. Latte - ₹400");
		System.out.println("3. Americano - ₹430");
		System.out.println("4. Cappuccino - ₹ 480");
		System.out.println("Please enter your choice!~ (1./2./3./4.)");
		int choice = scanner.nextInt();
		System.out.println("Let's select the number of cups you want for your perfect experience!☆");
		int noofcups = scanner.nextInt();
		int price = 0;
		String coffeetype ="";
		if (choice == 1) {
		    price = 320 * noofcups;
		    coffeetype = "Espresso";
		} else if (choice == 2) {
		        price = 400 * noofcups;
		        coffeetype ="Latte";
		    } else if (choice == 3) {
		            price = 430 * noofcups;
		            coffeetype = "Americano";
		        } else if (choice == 4) {
		            price = 480 * noofcups;
		            coffeetype = "Cappuccino";
		      } else {
		            System.out.println("We are sorry! There must have been a mistake in your order.Please recheck!~♡");
		            return;
		        }
		        System.out.println("\n 🫧🎀 Order Summary 🎀🫧");
		        System.out.println("Your name♡: " + name);
		        System.out.println("Your coffee mood for today!~ : " + coffeetype);
		        System.out.println("Number of cups you ordered to make your day memorable☆ : " + noofcups);
		        System.out.println("Total amount<3 : ₹" + price);
		        System.out.println("Coffe a day keeps worries away! Thank you for visiting out Lofi Coffee Cafè♡ Hoping to see you soon☕️");
		        scanner.close();
	}