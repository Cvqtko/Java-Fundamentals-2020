import java.util.Scanner;

public class Exercise_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String coin = scanner.nextLine();

		double sumCoins = 0;

		while (!"Start".equals(coin)) {
			switch (coin) {
			case "0.1":
			case "0.2":
			case "0.5":
			case "1":
			case "2":
				sumCoins = sumCoins + Double.parseDouble(coin);
				break;
			default:
				System.out.printf("Cannot accept %s%n", coin);
				break;
			}
			coin = scanner.nextLine();
		}

		String product = scanner.nextLine();
		double productPrice = 0;

		while (!"End".equals(product)) {
			switch (product) {
			case "Nuts":
				productPrice = 2.0;
				break;
			case "Water":
				productPrice = 0.7;
				break;
			case "Crisps":
				productPrice = 1.5;
				break;
			case "Soda":
				productPrice = 0.8;
				break;
			case "Coke":
				productPrice = 1.0;
				break;
			default:
				System.out.println("Invalid product");
				break;
			}

			if (sumCoins >= productPrice) {
				System.out.printf("Purchased %s%n", product);
				sumCoins = sumCoins - productPrice;
				productPrice = 0;
			} else if (productPrice > 0) {
				System.out.println("Sorry, not enough money");
				productPrice = 0;
			}
			product = scanner.nextLine();
		}
		System.out.printf("Change: %.2f", sumCoins);
	}
}
