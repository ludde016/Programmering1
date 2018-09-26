import java.util.Scanner; 

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in); 
		
		int intag1 = input.nextInt(); 
		int intag2 = input.nextInt(); 
		int intag3 = input.nextInt();
		
		for (int i = 1; i <= intag3; i++) {
			
				if(i % intag2 == 0 && i % intag1 == 0) {System.out.println("FizzBuzz");}
			
				else if(i % intag1 == 0) {System.out.println("Fizz");}
				
				else if(i % intag2 == 0) {System.out.println("Buzz");}
				
				else {System.out.print(i + "\r");}
				
			
		}
	}

}
