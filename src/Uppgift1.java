import java.util.Scanner; 

public class Uppgift1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Vad heter du?");
		
		String Namn = input.next();
		
		System.out.println("Hur gammal är du?");
		
		String Alder = input.next();
		
		System.out.println("Vad är din adress?");
		
		String Adress = input.next();
		
		System.out.println("Vad är ditt postnummer?");
		
		String Postnummer = input.next();
		
		System.out.println("I vilken stad bor du?");
		
		String Stad = input.next();
		
		System.out.println("Vad är ditt telefonnummer");
		
		String Nummer = input.next();
		
		input.close();
		
		System.out.println("Namn:     " + Namn);
		
		System.out.println("Ålder:    " + Alder);
		
		System.out.println("Adress:   " + Adress +"\r"+ "          " + Postnummer + " " + Stad);
		
		System.out.println("Nummer:   " + Nummer );
		
	}

}
