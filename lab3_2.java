import java.util.Scanner;

public class lab3_2 {
	public static void main(String[] args) {
		
		//prompt user for amount of water
		Scanner Kbrd1 = new Scanner(System.in);
		System.out.println("Enter the amount of water in Kilograms");
		double kg = Kbrd1.nextDouble();
		
		//prompt user for initial temperature of water
		Scanner Kbrd2 = new Scanner(System.in);
		System.out.println("Enter the initial temperature of the water (in degrees C)");
		double temp1 = Kbrd2.nextDouble();
		
		//prompt user for the final temperature of the water
		Scanner Kbrd3 = new Scanner(System.in);
		System.out.println("Enter the final temperature of the water (in degrees C)");
		double temp2 = Kbrd3.nextDouble();
		
		//Formula for energy
		double Q = (kg * (temp2-temp1) *4184);
		
		System.out.println(Q);
		
	}

}
