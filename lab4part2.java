import java.util.Scanner;
public class lab4part2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Weight: ");
		double w= scanner.nextDouble();
		
		if (w<0) {
			System.out.println("Invalid input");
			
		}else if (w == 0) {
			System.out.println("Invalid input");
			
		}else if (w>20) {
			System.out.println("Your package can't be shipped. It's too heavy fam...");
			
		}else if (0 < w ) {
			System.out.println("Cost: $3.50");
		}else if (w <= 0 ) {
			System.out.println("Cost: $3.50");
		}else if (1 < w ) {
			System.out.println("Cost: $5.50");
		}else if (w <= 3 ) {
			System.out.println("Cost: $5.50");
		}else if (3 < w ) {
			System.out.println("Cost: $8.50");
		}else if (w <= 10 ) {
			System.out.println("Cost: $8.50");
		}else if (10 < w ) {
			System.out.println("Cost: $10.50");
		}else if (w <= 20 ) {
			System.out.println("Cost: $3.50");
		}
		
	}
}
