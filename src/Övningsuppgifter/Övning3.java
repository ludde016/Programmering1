package Övningsuppgifter;

import java.util.Scanner; 

public class Övning3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int sum = 0;
		int medelsum = 0;
				
		
		while (true) {  int num = input.nextInt();
		sum = sum+num;
		
		if (num == 0) {break;}
		
		medelsum = medelsum + num/num;
		}
		
		input.close();
		double medel = sum/medelsum;  
		System.out.println(sum + "+" + medel);
			
	}
		
}
