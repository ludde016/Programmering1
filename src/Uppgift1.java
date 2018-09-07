import java.util.Scanner; 

public class Uppgift1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Vad heter du?");
		
		String Namn = input.next();
		
		System.out.println("Hur gammal är du?");
		
		String Alder = input.next();
		
		input.close();
		
	}

}
