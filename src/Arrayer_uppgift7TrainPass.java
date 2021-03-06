import java.util.Scanner;

public class Arrayer_uppgift7TrainPass {
	
	// Train passengers - Ludvig Swala

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int cap = input.nextInt();
		int stations = input.nextInt();
		int passengers = 0;
		int remain = 0;
		boolean real = true;

		for (int i = 0; i < stations; i++) {

			passengers -= input.nextInt();

			if (passengers < 0) {
				real = false;
			}

			passengers += input.nextInt();

			if (passengers > cap) {
				real = false;
			}

			remain = input.nextInt();

			if (remain > 0 && passengers < cap) {
				real = false;
			}

		}

		if (passengers > 0) {
			real = false;
		}

		if (real == true) {
			System.out.println("possible");
		} else {
			System.out.println("impossible");
		}

	}
}
