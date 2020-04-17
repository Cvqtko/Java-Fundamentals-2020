import java.util.Scanner;

public class Exercise_08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split("\\s+");

		double finalResult = 0.0;

		for (String string : input) {
			char firstLeter = string.charAt(0);
			char lastLetter = string.charAt(string.length() - 1);

			int number = Integer.parseInt(string.substring(1, string.length() - 1));
			double result = 0.0;
			if (Character.isUpperCase(firstLeter)) {
				result = number * 1.0 / (firstLeter - 64);
			} else {
				result = number * (firstLeter - 96);
			}
			if (Character.isUpperCase(lastLetter)) {
				result -= lastLetter - 64;

			} else {
				result += lastLetter - 96;
			}
			finalResult += result;
		}
		System.out.printf("%.2f", finalResult);
	}
}
