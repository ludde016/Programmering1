	import java.util.Scanner; 

public class Arrayer_Uppgifter3 {
	
	// Bijele - Ludvig Swala
	
	public static void main(String[] args) {
		
		int[] shack = new int[6]; 
		int[] rätt = {1, 1, 2, 2, 2, 8};
		Scanner intag = new Scanner(System.in); 
		
		for (int i = 0; i < shack.length; i++) {
			shack[i] = intag.nextInt(); 
			
		}
		
		for (int i = 0; i < shack.length; i++) {
			shack[i] = rätt[i] - shack[i]; 
		}
		
		for (int i = 0; i < shack.length; i++) {
			System.out.print(shack[i] + " ");
		}
	
	}

}
