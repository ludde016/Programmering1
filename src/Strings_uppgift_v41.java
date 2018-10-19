import java.util.Scanner;

public class Strings_uppgift_v41 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// double intag = input.nextDouble();
		// String in = input.nextLine();
		// String ord = input.nextLine();
		// char c = input.next().charAt(0);
		String word = input.nextLine();

		// System.out.println(volume(intag));
		// System.out.println(reverse(in));
		// System.out.println(count(ord, c));
		System.out.println(sjorovare(word));
	}

	public static double volume(double intag) {

		intag = intag * intag * intag;
		intag = 4 * intag * 3.14 / 3;
		return intag;
	}

	public static String reverse(String in) {

		String str = "";

		for (int i = in.length() - 1; i >= 0; i--) {
			str += in.charAt(i);

		}

		return str;
	}

	public static int count(String ord, char c) {

		int antal = 0;

		for (int i = 0; i < ord.length(); i++) {

			if (ord.toLowerCase().charAt(i) == (c)) {
				antal = antal + 1;
			}
		}

		return antal;
	}

	public static String sjorovare(String word) {

		String nytt = "";

		for (int i = 0; i < word.length(); i++) {
			switch (word.toLowerCase().charAt(i)) {
			case 'b':
			case 'c':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'v':
			case 'w':
			case 'z':

				nytt += word.charAt(i) + "o" + word.charAt(i);
			}

			switch (word.toLowerCase().charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'y':
			case '�':
			case '�':
			case '�':
			case ' ':
			case '.':
			case '-':
			case ',': 
			case '?':
			case '!': 
				nytt += word.charAt(i);
				
			}
			switch (word.toLowerCase().charAt(i)) { 
			case 'x':
				nytt += "koksos";  
			
			}
		}
		return nytt;
	}
}
