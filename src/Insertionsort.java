import java.util.Arrays;

public class Insertionsort {
	
	public static void main(String[] args) {
		int[] array = { 5, 0, 1, 3, 5 };
		
		for (int j = 0; j < args.length; j++) {
			int min = array[j];
			int index = 0;
			for (int i = j+1; i < args.length; i++) {
				if (min > array[i]) {
					min = array[i];
					index = i;

				}
			}
			int temp = array[0];
			array[0] = array[index];
			array[index] = temp;
		} 
	} // INTE KLAR, FUNGERAR EJ

}
