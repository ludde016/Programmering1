package Kattis_uppgifter;

import java.util.Scanner;

public class TakeTwo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int N = input.nextInt();

		if (N % 2 == 0) {
			System.out.println("Bob");
		}
		
		else {
			System.out.println("Alice"); 
		}
		input.close();
	}

}
