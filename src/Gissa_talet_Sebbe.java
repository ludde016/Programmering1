import java.util.Scanner;

public class Gissa_talet_Sebbe {

	static boolean haswon = false;
	static int lives = 10;
	static boolean replay = true;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		while (replay != false) {

			System.out.println("Gissa talet mellan 0 och 40");

			int num = randomnum();

			while (haswon != true || lives != 0) { // F�rut var det // men det g�r ju s� att koden inte fungerar p� s� s�tt som t�nkt. DOCK s� skrev jag aldrig exakt att det skulle vara && i den h�r while-loopen

				int guess = input.nextInt();

				checkguess(guess, num);
			}

		}
	}

	public static int randomnum() {

		double placeholder = Math.random();
		placeholder = placeholder * 40 + 1;

		int num = (int) placeholder;

		return num;
	}

	private static void checkguess(int guess, int num) {

		if (guess == num) {

			haswon = true;

		} else if (num < guess) {

			lives--;
			if (lives != 0) {
				System.out.println("Talet �r l�gre �n ditt gissning, du har nu " + lives + " liv kvar.");

				return;
			}

		} else {

			lives--;
			if (lives != 0) {
				System.out.println("Talet �r h�gre �n ditt gissning, du har nu " + lives + " liv kvar.");

				return;
			}
		}
		if (lives == 0) {
			System.out.println("Du har f�rlorat, vill du spela igen? [Y] eller [N]");
		}
		if (haswon = true) {
			System.out.println("Du vinner! Du fick " + lives * 2 + " po�ng, vill du spela igen? [Y] eller [N]");
		}

		String cont = input.next();

		if (cont.equals("Y")) {
			 
			replay = true;
			lives = 10;
		} else if (cont.equals("N")) {
			
			replay = false;
		}

	}

}
