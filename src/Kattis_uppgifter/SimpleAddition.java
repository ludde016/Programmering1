package Kattis_uppgifter;

import java.math.BigInteger;
import java.util.Scanner;

public class SimpleAddition {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger reallyBig1 = input.nextBigInteger();
		BigInteger reallyBig2 = input.nextBigInteger();
		System.out.println(reallyBig1.add(reallyBig2));
	}

}
