import java.util.Scanner;

public class Arrayer_uppgift6Ostgotska {
	
	// Östgötska - Ludvig Swala
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String intag = input.nextLine();
		String[] ord = intag.split(" ");
		double fall = 0;
		
		for (int i = 0; i < ord.length; i++) {
			if (ord[i].contains("ae") == true) {
				fall++;
			}
			
		}
		double procent = fall / ord.length;
		if (procent == 0.4 || procent > 0.4) {
			System.out.println("dae ae ju traeligt va");
		}
		else {
			System.out.println("haer talar vi rikssvenska");
		}
	}

}
