public class DivisibilityCheck{
	public static void main(String[] args) {
		int number = 60;
		if (number%5 == 0 || number%11 == 0){
		    System.out.println(number + "number is divisible by 5 and 11");
		} else {
		    System.out.println (number + "number is not divisible by 5 and 11");
		}
	}
}