import java.util.Scanner; 

public class Uppgift2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Skriv in 10 heltal: ");
		
		double tal1 = input.nextDouble(); 
		double largest = tal1; 
		double smallest = tal1;
		
		double tal2 = input.nextDouble(); 
		if (tal2 > largest) {largest = tal2;}
		if (tal2 < smallest) {smallest = tal2;}
		
		double tal3 = input.nextDouble(); 
		if (tal3 > largest) {largest = tal3;}
		if (tal3 < smallest) {smallest = tal3;}
		
		double tal4 = input.nextDouble(); 
		if (tal4 > largest) {largest = tal4;}
		if (tal4 < smallest) {smallest = tal4;}
		
		double tal5 = input.nextDouble(); 
		if (tal5 > largest) {largest = tal5;}
		if (tal5 < smallest) {smallest = tal5;}
		
		double tal6 = input.nextDouble(); 
		if (tal6 > largest) {largest = tal6;}
		if (tal6 < smallest) {smallest = tal6;}
		
		double tal7 = input.nextDouble(); 
		if (tal7 > largest) {largest = tal7;}
		if (tal7 < smallest) {smallest = tal7;}
		
		double tal8 = input.nextDouble();
		if (tal8 > largest) {largest = tal8;}
		if (tal8 < smallest) {smallest = tal8;}
		
		double tal9 = input.nextDouble(); 
		if (tal9 > largest) {largest = tal9;}
		if (tal9 < smallest) {smallest = tal9;}
		
		double tal0 = input.nextDouble(); 
		if (tal0 > largest) {largest = tal0;}
		if (tal0 < smallest) {smallest = tal0;}
		
		input.close();
		
		double total = (tal1 + tal2 + tal3 + tal4 + tal5 + tal6 + tal7 + tal8 + tal9 + tal0); 
	    double medel = (total/10); 
		
		System.out.println("Högst: " + largest);
		System.out.println("Lägst: " + smallest);
		System.out.println("Medelvärde: " + medel );
	
	}

}
