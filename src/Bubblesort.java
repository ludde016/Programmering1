import java.util.Arrays;

public class Bubblesort {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 0, 4, 2, 4, 6, 3};
		sort(arr);
		System.out.print(Arrays.toString(arr)); 
		} 

	public static void sort(int[] array) {
		int comparisons = 0;
		int swaps = 0; 
		boolean hasSwapped = true; // Behövs för att göra en metod som inte behöver gå igenom hela arrayen 1 gång för varje tal, utan om den går igenom arrayen och inte swappar så är den klar.
		for (int j = 0; j < array.length && hasSwapped; j++) {
			hasSwapped = false;
			for (int i = 0; i < array.length - 1 - j; i++) { // - j gör så att vi inte tittar på de talen vi vet är sorterade
				comparisons++; 
				if (array[i] > array[i + 1]) {
					int temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
					swaps++;
					hasSwapped = true; 
				}

			}
		}
		System.out.println("Comparisons : " + comparisons);
		System.out.println("Swaps: " + swaps);
	}

}
