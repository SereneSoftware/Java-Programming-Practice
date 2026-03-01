import java.util.Scanner;
public class TicketBooking {
	public static void main(String[] args) {
		Scanner scanner = new
		Scanner(System.in);
		System.out.println("Welcome to this adventurous world of ENDLESS movies!! 🎬 Please enter your name to enter this world!!");
		System.out.println("Enter your name here: ");
		String name = scanner.nextLine();
		System.out.println("Hello my buddy " + name + "!, Let's select your movie world for today! :");
		System.out.println("1. Makkhi : A movie that protrays a lover who takes revenge for his love. His love takes him on another level. How is this all connected to a makkhi?,Watch the movie. 🎟 Price per ticket: ₹250");
		                   System.out.println("2. I hate luv Stories : The story is a parody of Indian love movies. The actor and actresses being in a movie wants to explore their relationship and their different ideas of love. Watch the movie to see the plots and differences they face.🎟 PRICE PER TICKET : ₹300");
		                   System.out.println("3.Bhakshak: The story is based on a real life incident. It revolves around a determined reporter who wants justice for their country and wants to expose the truth at any cost. How will they do it? watch the movie and see. 🎟 PRICE PER TICKET: ₹230");
		                   System.out.println("4. Stranger Things: Starnger things being one the best series out there, launches as a movie now!! Get your popcorn and enjoy being at Hawkins to cover the incidents that follow! 🎟PRICE PER TICKET: ₹500");
		                   System.out.println("Let's see what you choose!! (1./2./3./4.)");
		                   int choice = scanner.nextInt();
		                   System.out.println("Let's see how many movie lovers you got!! Enter the number of tickets!! 🎟 ");
		                   int tickets = scanner.nextInt();
		                   int price = 0;
		                   String moviename = "";
		                   if (choice ==1 ) {
		                       price = 250 * tickets;
		                       moviename= "Makkhi 🎬";
		                   } else if (choice == 2) {
		                       price = 300 * tickets;
		                       moviename = "I Hate Luv Stories🎬";
		                   } else if (choice == 3) {
		                       price = 230 * tickets;
		                       moviename = "Bhakshak🎬";
		                   } else if (choice ==4) {
		                       price = 500 * tickets;
		                       moviename = "Stranger Things🎬";
		                   } else {
		                       System.out.println("❌️ You might have made a mistake!! Let's rewind your process.");
		                       return;
		                   }
		                   System.out.println("\n🎟《《 Movie Ticket Summary 》》🎟");
		                   System.out.println("👤Name: " + name);
		                   System.out.println("📽 Movie: " + moviename);
		                   System.out.println("🧑‍🧑‍🧒‍🧒 Number of Tickets: " + tickets);
		                   System.out.println("💰Your total: ₹ " + price);
		                   System.out.println("Your movie choice is definitely worth an Oscar!! 🎞🎬 Enjoy your day with your buddies. Thank you for booking with AanyaBooks!!����");
		                   scanner.close();
	}
}