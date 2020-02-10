import java.util.Scanner;
public class Lab3 {
	public static void main(String[] args) {
		
		//Prompt user for temperature in degrees Celsius
		Scanner Kbrd = new Scanner(System.in);
		System.out.println("Enter the temperature in degrees C");
		double C = Kbrd.nextDouble();
		
		//formula for Celsius to Fahrenheit
		double fahr = (1.8 *C +32);
		System.out.println("Temperature in Fahrenheit is : "+fahr);
	}
	
	
	
	
}
