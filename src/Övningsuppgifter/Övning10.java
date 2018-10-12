package Övningsuppgifter;

import java.util.Scanner;

public class Övning10 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Bas?"); 
		
		int intag = input.nextInt();
		int intag2 = intag; 
		
		for (int i = intag; i > 1; i--) {
			
			for (int j = 1; j <= intag; j++) {
				System.out.print(" ");
					if (j == intag - 1) { System.out.print(" x");
						
					}
				
				
			}
			
		}
		
	}

}
