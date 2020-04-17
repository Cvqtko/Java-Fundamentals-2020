import java.util.Scanner;

public class Exercise_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		StringBuilder result = new StringBuilder();

		char baseLetter = input.charAt(0);
		result.append(baseLetter);
		for (int i = 1; i < input.length(); i++) {
			char currentletter = input.charAt(i);
			if (baseLetter != currentletter) {
				result.append(currentletter);
				baseLetter = currentletter;
			}
		}
		System.out.println(result);
	}
}
