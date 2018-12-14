import java.util.Scanner;

public class Arrayer_Uppgifter5_ReverseRot {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int igen = 1;
		
		while (igen > 0) {
			
		    igen = input.nextInt();
			String intag = input.next();
			String reverse = "";

			if (igen < 1) {
				break;
			}

			if (igen >= 28) {
				igen = igen % 28;
			}

			for (int i = intag.length() - 1; i >= 0; i--) {
				reverse += intag.charAt(i);

			}

			for (int g = 0; g < igen; g++) {
				String newWord = "";
				for (int j = 0; j < reverse.length(); j++) {

					switch (reverse.charAt((j))) {
					case 'A':
						newWord += "B";
						break;
					case 'B':
						newWord += "C";
						break;
					case 'C':
						newWord += "D";
						break;
					case 'D':
						newWord += "E";
						break;
					case 'E':
						newWord += "F";
						break;
					case 'F':
						newWord += "G";
						break;
					case 'G':
						newWord += "H";
						break;
					case 'H':
						newWord += "I";
						break;
					case 'I':
						newWord += "J";
						break;
					case 'J':
						newWord += "K";
						break;
					case 'K':
						newWord += "L";
						break;
					case 'L':
						newWord += "M";
						break;
					case 'M':
						newWord += "N";
						break;
					case 'N':
						newWord += "O";
						break;
					case 'O':
						newWord += "P";
						break;
					case 'P':
						newWord += "Q";
						break;
					case 'Q':
						newWord += "R";
						break;
					case 'R':
						newWord += "S";
						break;
					case 'S':
						newWord += "T";
						break;
					case 'T':
						newWord += "U";
						break;
					case 'U':
						newWord += "V";
						break;
					case 'V':
						newWord += "W";
						break;
					case 'W':
						newWord += "X";
						break;
					case 'X':
						newWord += "Y";
						break;
					case 'Y':
						newWord += "Z";
						break;
					case 'Z':
						newWord += "_";
						break;
					case '_':
						newWord += ".";
						break;
					case '.':
						newWord += "A";
						break;

					}
				}
				reverse = newWord;
			}
			System.out.println(reverse);
		}
	}
}
