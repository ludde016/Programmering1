import java.util.Scanner;

public class Arrayer_Uppgifter4 {
	
	//Speed limit - Ludvig Swala

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean check = true;
		int antal;
		int total = 0;
		int temp;
		int[] mil;
		
		while(check == true) {
			total = 0; 
			antal = input.nextInt();
			if (antal < 1) {
				check = false;
			}
			if (check == true) {
			
			mil = new int[antal * 2];
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
			else {
				break;  
			}
		}

	}
}
