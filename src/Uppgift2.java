import java.util.Scanner; 

public class Uppgift2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Skriv in 10 heltal: ");
		
		double largest = 0; 
		
		double tal1 = input.nextDouble(); 
		if (tal1 > 0) {largest = tal1;}
		
		double tal2 = input.nextDouble(); 
		if (tal2 > tal1) {largest = tal1;}
		
		double tal3 = input.nextDouble(); 
		if (tal3 > tal2) {largest = tal1;}
		
		double tal4 = input.nextDouble(); 
		if (tal4 > tal3) {largest = tal1;}
		
		double tal5 = input.nextDouble(); 
		if (tal5 > tal4) {largest = tal1;}
		
		double tal6 = input.nextDouble(); 
		if (tal6 > tal5) {largest = tal1;}
		
		double tal7 = input.nextDouble(); 
		if (tal7 > tal6) {largest = tal1;}
		
		double tal8 = input.nextDouble();
		if (tal8 > tal7) {largest = tal1;}
		
		double tal9 = input.nextDouble(); 
		if (tal9 > tal8) {largest = tal1;}
		
		double tal0 = input.nextDouble(); 
		if (tal0 > tal9) {largest = tal1;}
	
	}

}
