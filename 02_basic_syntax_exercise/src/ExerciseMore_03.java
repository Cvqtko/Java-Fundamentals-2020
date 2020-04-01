import java.util.Scanner;

public class ExerciseMore_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		{
			double money = Double.parseDouble(scanner.nextLine());

			double spend = 0;

			while (true) {
				String game = scanner.nextLine();

				if ("Game Time".equals(game)) {
					break;
				}

				double price = 0;

				switch (game) {
				case "OutFall 4":
					price = 39.99;
					break;
				case "CS: OG":
					price = 15.99;
					break;
				case "Zplinter Zell":
					price = 19.99;
					break;
				case "Honored 2":
					price = 59.99;
					break;
				case "RoverWatch":
					price = 29.99;
					break;
				case "RoverWatch Origins Edition":
					price = 39.99;
					break;
				default:
					System.out.println("Not Found");
					continue;
				}

				if (price > money) {
					System.out.println("Too Expensive");
					continue;
				}

				money -= price;
				spend += price;
				System.out.printf("Bought %s%n", game);

				if (money == 0) {
					System.out.println("Out of money!");
					return;
				}
			}

			System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spend, money);
		}
	}
}