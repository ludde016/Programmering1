package Övningsuppgifter;

import java.util.Scanner;

public class Övning4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int total = 1;

		for (int i = 0; i < 10; i++) {

			int tal = input.nextInt();
			total = total * tal;
			if (total >= 100000) {
				System.out.println(total); }
				if (i == 9) {
					System.out.println(total); }
			}
			input.close(); 
		}

	}


