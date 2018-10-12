package Övningsuppgifter;

import java.util.Scanner;

public class Övning2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int tal = input.nextInt();
		int sum = 0;

		for (int i = 0; i < tal;) {
			int nytal = tal % 10;
			System.out.println(nytal + "+");
			tal = tal - nytal;
			tal = tal / 10;
			sum = sum + nytal;

		}
		System.out.println("=" + sum);

	}
}