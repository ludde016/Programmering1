import java.util.Scanner;

public class EncodedMessage {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		int iterationer = 0;
		boolean jumped = false;

		while (iterationer < cases) {
			String encoded = input.next();
			String decoded = "";
			int jump = (int) Math.sqrt(encoded.length());

			for (int i = 1; i < jump + 1; i++) {
				int firstjump = jump - i;
				jumped = false;
				for (int j = 1; j < jump + 1; j++) {
					if (j * jump > encoded.length()) {
						break;
					}
					if (i > 0 && jumped == false) {
						decoded += encoded.charAt(j * firstjump);
						jumped = true;
					} else if (i > 0 && jumped == true) {
						decoded += encoded.charAt((j * jump) - i);
					} else {
						decoded += encoded.charAt(j * jump - 1);
					}

				}

			}
			iterationer++;
			System.out.println(decoded);

		}
	}
}
