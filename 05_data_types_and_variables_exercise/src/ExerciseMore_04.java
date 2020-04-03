import java.util.Scanner;

public class ExerciseMore_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int key = Integer.parseInt(scanner.nextLine());
		int n = Integer.parseInt(scanner.nextLine());
		String decryptedMessage = "";
		int decryptedChar = 0;
		while (n-- > 0) {
			char ch = scanner.nextLine().charAt(0);
			decryptedChar = (int) ch + key;
			decryptedMessage += (char) decryptedChar;
		}
		System.out.println(decryptedMessage);
	}
}
