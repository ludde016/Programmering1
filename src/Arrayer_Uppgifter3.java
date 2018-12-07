	import java.util.Scanner; 

public class Arrayer_Uppgifter3 {
	
	public static void main(String[] args) {
		
		int[] shack = new int[6]; 
		Scanner intag = new Scanner(System.in); 
		
		for (int i = 0; i < shack.length; i++) {
			shack[i] = intag.nextInt(); 
			
		}
		
		for (int i = 0; i < shack.length; i++) {
			System.out.println(shack[i]);
		}
		
	
	}

}
