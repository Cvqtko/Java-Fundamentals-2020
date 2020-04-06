import java.util.Scanner;

public class Exercise_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i <= n; i++) {
			if (isTopNumber(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean isTopNumber(int number) {
		int sum = 0;
		boolean containsOdd = false;
		while (number > 0) {
			int digit = number % 10;
			sum += digit;
			number = number / 10;
			if (digit % 2 != 0) {
				containsOdd = true;
			}
		}
		if (sum % 8 == 0 && containsOdd) {
			return true;
		}
		return false;
	}
}
