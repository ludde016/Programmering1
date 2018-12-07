import java.util.Scanner;

public class Arrayer_Uppgifter4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int antal = input.nextInt();
		int total = 0;
		int temp;
		int[] mil = new int[antal * 2];
		
		for (int j = 0; j < mil.length; j++) {
			mil[j] = input.nextInt(); 
		}
		
		for (int i = 0; i < antal * 2; i += 2) {
			if (i - 1 > -1) {
				temp = mil[i + 1] - mil[i - 1];
			} else {
				temp = mil[i + 1];
			}
			total += mil[i] * temp;
		}
		System.out.println(total + " miles");

	}
}
