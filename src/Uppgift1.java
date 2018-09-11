import java.util.Scanner; 

public class Uppgift1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Vad heter du?");
		
		String Namn = input.nextLine();
		
		System.out.println("Hur gammal är du?");
		
		String Alder = input.nextLine();
		
		System.out.println("Vad är din adress?");
		
		String Adress = input.nextLine();
		
		System.out.println("Vad är ditt postnummer?");
		
		String Postnummer = input.nextLine();
		
		System.out.println("I vilken stad bor du?");
		
		String Stad = input.nextLine();
		
		System.out.println("Vad är ditt telefonnummer");
		
		String Nummer = input.nextLine();
		
		input.close();
		
		System.out.println("Namn:     " + Namn);
		
		System.out.println("Ålder:    " + Alder);
		
		System.out.println("Adress:   " + Adress +"\r"+ "          " + Postnummer + " " + Stad);
		
		System.out.println("Nummer:   " + Nummer );
		
	}

}
