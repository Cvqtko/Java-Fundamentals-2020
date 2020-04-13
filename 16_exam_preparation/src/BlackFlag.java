import java.util.Scanner;

public class BlackFlag {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int days = Integer.parseInt(scanner.nextLine());
		int plunderPerDay = Integer.parseInt(scanner.nextLine());
		double targetPlunder = Double.parseDouble(scanner.nextLine());

		double totalPlunder = 0;

		for (int i = 1; i <= days; i++) {

			totalPlunder += plunderPerDay;

			if (i % 3 == 0) {
				totalPlunder += plunderPerDay / 2;
			}
			if (i % 5 == 0) {
				totalPlunder = 0.7 * totalPlunder;
			}
		}
		if (totalPlunder >= targetPlunder) {
			System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
		} else {
			double collectedPercentage = (totalPlunder / targetPlunder) * 100;
			System.out.printf("Collected only %.2f%% of the plunder.", collectedPercentage);
		}
	}
}
