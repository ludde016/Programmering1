import java.util.Scanner;

public class R2Uppgift {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int tal1 = input.nextInt();
		int tal2 = input.nextInt();
		int R2 = (tal2*2 - tal1);
		
		System.out.println(R2);
		
		input.close();
		
		
		//Har även lämnat in uppgifter på Kattis , se my profil: https://open.kattis.com/users/ludvig-swala
	}
}
