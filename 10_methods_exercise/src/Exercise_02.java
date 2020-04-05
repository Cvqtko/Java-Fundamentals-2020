import java.util.Scanner;

public class Exercise_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		int count = countOfVowels(input);
		System.out.println(count);
	}

	private static int countOfVowels(String text) {
		int counter = 0;
		for (int i = 0; i < text.length(); i++) {
			char letter = text.toLowerCase().charAt(i);
			switch (letter) {
			case 'a':
			case 'u':
			case 'e':
			case 'i':
			case 'o':
				counter++;
			}
		}
		return counter;
	}
}
