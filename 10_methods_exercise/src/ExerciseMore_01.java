import java.util.Arrays;
import java.util.Scanner;

public class ExerciseMore_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		checkInput(scanner, line);
	}

	private static void checkInput(Scanner scanner, String line) {
		switch (line) {
		case "int":
			int number = Integer.parseInt(scanner.nextLine());
			System.out.println(number * 2);
			break;
		case "real":
			double realNumber = Double.parseDouble(scanner.nextLine());
			System.out.println(realNumber * 1.5);
			break;
		case "string":
			String word = scanner.nextLine();
			System.out.println("$" + word + "$");
			break;
		}
	}
}
