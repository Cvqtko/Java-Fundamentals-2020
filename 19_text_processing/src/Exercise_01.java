import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();

		while (!"end".equals(word)) {
			String reversed = reverse(word);

			System.out.println(word + " = " + reversed);

			word = scanner.nextLine();
		}

	}

	public static String reverse(String word) {
		String result = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			result += word.charAt(i);
		}
		return result;
	}
}
