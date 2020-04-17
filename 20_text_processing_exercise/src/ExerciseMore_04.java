import java.util.Scanner;

public class ExerciseMore_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String morse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "|",
				".---", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----" };
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ 1234567890";

		String input = scanner.nextLine();

		morseToEnglish(input, alphabet, morse);

	}

	public static void morseToEnglish(String morseCode, String alphabet, String morse[]) {
		String[] morseCodeChars = morseCode.split("\\s+");
		StringBuilder decoded = new StringBuilder();
		for (int i = 0; i < morseCodeChars.length; i++) {
			for (int j = 0; j < morse.length; j++) {
				if (morseCodeChars[i].equals(morse[j])) {
					decoded.append(alphabet.charAt(j));
				}
			}
		}
		System.out.println(decoded);
	}
}
