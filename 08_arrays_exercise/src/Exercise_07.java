import java.util.Arrays;
import java.util.Scanner;

public class Exercise_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

		int length = 1;
		int endIndex = -1;
		int bestLength = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] == numbers[i + 1]) {
				length++;
				if (length > bestLength) {
					bestLength = length;
					endIndex = i + 1;
				}
			} else {
				length = 1;
			}
		}
		for (int i = endIndex; i > endIndex - bestLength; i--) {
			System.out.print(numbers[i] + " ");
		}
	}
}
