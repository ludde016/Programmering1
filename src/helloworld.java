import java.util.Scanner;

public class helloworld {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Skriv vad du än begär, men gärna 2 tal");

		int x = input.nextInt();
		int y = input.nextInt();
		input.close();

		if (x > 0 && y > 0) {
			System.out.println(1);
		}
		if (x > 0 && y < 0) {
			System.out.println(4);
		}
		if (x < 0 && y > 0) {
			System.out.println(2);
		}
		if (x < 0 && y < 0) {
			System.out.println(3);
		}
		if (x == 0 || y == 0) {
			System.out.println(0);
		}

	}// END main

} // END helloworld

// Dubbel slash är kommentarer, text som ignoreras av programmet. Ctrl + shift + F fixar allt.