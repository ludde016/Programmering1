import java.util.Scanner;

public class Strings_uppgift_v41 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double intag = input.nextDouble();
		String in = input.nextLine();

		System.out.println(volume(intag));
		System.out.println(reverse(in));
	}

	public static double volume(double intag) {

		intag = intag * intag * intag;
		intag = 4 * intag * 3.14 / 3;
		return intag;
	}
	
	public static String reverse(String in) {
		
		
		
		return in;
	}
}
