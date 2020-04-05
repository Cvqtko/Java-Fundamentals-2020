import java.util.Scanner;

public class Exercise_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String product = scanner.nextLine();

		int quantity = Integer.parseInt(scanner.nextLine());
		System.out.println(calcPrice(product, quantity));

	}

	private static double calcPrice(String product, int quantity) {
		switch (product) {
		case "coffee":
			return 1.50 * quantity;
		case "water":
			return 1.00 * quantity;
		case "coke":
			return 1.40 * quantity;
		case "snacks":
			return 2.00 * quantity;
		default:
			return -1.00;
		}
	}
}
