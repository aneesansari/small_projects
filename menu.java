

import java.util.Scanner;
public class menu {
	public static void main(String[] args) {
		System.out.println("Menu:");
		System.out.println("1.Chicken Wings - $6.85");
		System.out.println("2.Pizza Pie - $12.00");
		System.out.println("3.Sub Sandwich - $8.00");
		System.out.println("4.Soft Drink - $3.25");
		System.out.println("5.Water - $2.50");
		
		//prompt user for initial temperature of water
				Scanner scanner = new Scanner(System.in);
				System.out.println("Choose from the menu by entering the corrosponding number");
				int choice = scanner.nextInt();
		
		
		switch (choice) {
		  case 1:
		    System.out.println("Chicken Wings");
		    break;
		  case 2:
		    System.out.println("Pizza Pie");
		    break;
		  case 3:
		    System.out.println("Sub Sandwich");
		    break;
		  case 4:
		    System.out.println("Soft Drink");
		    break;
		  case 5:
		    System.out.println("Water");
		    break;
		  
		}
		
	}
	
	

}
	