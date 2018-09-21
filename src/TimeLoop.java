import java.util.Scanner;

	public class TimeLoop {

		public static void main(String[] args) {
			
			Scanner input = new Scanner (System.in); 
			
			double tal = input.nextInt(); 
			
			for (int i = 1; i <= tal; i++) { 
				
			System.out.println(i + " Abracadabra");
				
		}
		input.close();
	}
}
			
			
