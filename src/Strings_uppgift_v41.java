import java.util.Scanner;

public class Strings_uppgift_v41 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// double intag = input.nextDouble();
		// String in = input.nextLine();
		// String ord = input.next();
		// char c = input.next().charAt(0); 

		// System.out.println(volume(intag));
		//System.out.println(reverse(in));
		// System.out.println(count(ord, c));
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
		
		for (int i = 0; i < ord.length() ; i++) {
			System.out.println("INDEX " + i + ": " + ord.charAt(i));
			
			if (ord.charAt(i) == (c)) { 
				antal = antal + 1; 
			}
		}
		
		
		return antal;
	}
}
