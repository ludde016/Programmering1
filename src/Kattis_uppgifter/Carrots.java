package Kattis_uppgifter;

import java.util.Scanner;

public class Carrots {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int tal1 = input.nextInt();
		int tal2 = input.nextInt();

		for (int j = 0; j <= tal1; j++) {
			String intag = input.nextLine();
			if (j == tal1) {
				System.out.println(tal2);
			}
		}
	}
}