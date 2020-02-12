

import java.util.Scanner;
public class lab04 {
	public static void main(String[] args) {
		
		// Ask for 'a' value from user//
		Scanner scannera = new Scanner(System.in);
		System.out.println("Enter a, b, c");
		double a= scannera.nextDouble();
		double b= scannera.nextDouble();
		double c= scannera.nextDouble();
		
		// Calculating the discriminant//
		double disc= (Math.pow(b, 2) - 4*a*c);
		
		// Calculating the square root of the discriminant//
		double sqrt = Math.sqrt(disc);
		
		//Calculating roots//
		
		//positive disc//
		if (disc > 0) {
			double root1 = (-b + sqrt)/(2*a);
	        double root2 = (-b - sqrt)/(2*a);
	        System.out.println("Roots are : "+ root1 +" and "+root2);
	        
	        //disc is 0//
	      }else if(disc == 0){
	         System.out.println("Root is :: "+(-b + sqrt)/(2*a));
	         
	         //negative disc
		}else 
			
			System.out.println("no real roots");
		
	}

}
