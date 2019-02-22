import java.util.Scanner;

public class Arrayer_Uppgift2 {
	
	// What does the fox say? - Ludvig Swala

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int cases = input.nextInt();input.nextLine();
		int sum = 0;
		String fox;
		String[] sounds;
		boolean first = true;

		for (int i2 = 0; i2 < cases; i2++) {
			first = true;
			fox = input.nextLine();
			sounds = fox.split(" ");
			while (first == true) {
				String intag = input.nextLine();
				if (intag.equals("what does the fox say?")) {
					first = false;
				}
				String[] knownsounds = intag.split(" ");

				for (int i = 0; i < sounds.length; i++) {
					if (knownsounds[2].equals(sounds[i])) {
						sounds[i] = "";

					}

				}
			}
			if (first == false) {
				for (int i = 0; i < sounds.length; i++) {
					if (!sounds[i].equals("")) {
						System.out.print(sounds[i] + " ");
					}
				}
				sum++; // inför när jag ska kunna köra om koden flera gånger
			}
		}
		if (sum == cases) {
			input.close(); // stänger input när siffran man skriver in först är samma som gånger man kört
							// igenom koden

		}
	}
}
