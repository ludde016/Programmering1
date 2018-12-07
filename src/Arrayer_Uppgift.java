import java.util.Scanner;

public class Arrayer_Uppgift {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int cases = input.nextInt();input.nextLine();
		int first = input.nextInt();input.nextLine();
		int summa = 0;
		String[] cities = new String[first];
		summa = first;
		boolean[] test;

		for (int i1 = 0; i1 < cases; i1++) {
			if (i1 > 0) {
				int second = input.nextInt();input.nextLine();
				first = second;
				summa = second;
				cities = new String[second];
			}

			for (int i = 0; i < first; i++) {
				cities[i] = input.nextLine();
			}
			test = new boolean[cities.length];

			for (int i = 0; i < cities.length; i++) {
				for (int j = i + 1; j < cities.length; j++) {
					if (cities[i].equals(cities[j]) && test[j] != true) {
						test[j] = true;
						summa = summa - 1;

					}

				}

			}
			System.out.println(summa);

		}
	}
}
