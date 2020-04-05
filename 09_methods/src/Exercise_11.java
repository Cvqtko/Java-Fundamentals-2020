import java.util.Arrays;
import java.util.Scanner;

public class Exercise_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = Double.parseDouble(scanner.nextLine());
		String operation = scanner.nextLine();
		double b = Double.parseDouble(scanner.nextLine());
		System.out.println(calculate(a, operation, b));
	}

	private static double calculate(double a, String operation, double b) {
		double result = 0.0;
		switch (operation) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
			result = a / b;
			break;
		}
		return result;
	}

}
