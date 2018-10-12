package Kattis_uppgifter;

import java.util.Scanner;

public class Pet {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int nysumma = 0; 
		int storst = 0; 
		int deltagare = 0; 

		for (int j = 1; j <= 5; j++) {
			
			nysumma = 0; 
			
			for (int i = 1; i <= 4; i++) {
				int tal = input.nextInt(); 
				nysumma = nysumma + tal; 
				
			}
			if (nysumma > storst) {
				storst = nysumma;
				deltagare = j; 
			}

		}
		input.close();
		System.out.println(deltagare + " " + storst);
		
		
	}
}
