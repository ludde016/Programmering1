import java.util.Scanner; 

public class Spavanc {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in); 
		
		int H = input.nextInt(); 
		int M = input.nextInt();
		
		int NyM = (M - 45); 
		
		if (NyM < 0  ) { 
			int NyH = (H - 1); 
			int NyNyM = (NyM + 60); 
			if (NyH < 0) {NyH = (23);}
			
			System.out.println(NyH + " " + NyNyM );
			}
		else System.out.println(H + " " + NyM);
		
	
		
		
		
	}

}
