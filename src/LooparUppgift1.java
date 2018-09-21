import java.util.Scanner;


public class LooparUppgift1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int siffra = input.nextInt(); 		
				
		double summa = 0;
		
		for (int i = 0; i < 100; i++) {
			
			summa = (summa+i); 
		}
		
		System.out.println(summa);
		
		for (int i = 26; i < 50; i+=2) {
			
			System.out.println(i);
		
	}
		for (int i = 26; i < 50; i+=2) {
			
			System.out.println(i);
		}
		for (int i = 20; i > 0; i-=2) {
			
			System.out.println(i);
		}
		for (int i = 0; i < 11; i++) {
			
			System.out.println(i*siffra);
			
		}
		for (int i = 0; i < siffra; i++) {
			
			System.out.println(i);
			
		}
		
	}
}