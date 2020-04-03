import java.util.Scanner;

public class Exercise_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int startingYield = Integer.parseInt(scanner.nextLine());
		int yield = 0;
		int days = 0;
		int workersConsume = 26;
		while (startingYield >= 100) {
			days++;
			yield += startingYield;
			startingYield -= 10;
			yield -= workersConsume;
		}
		if (yield >= workersConsume)
			yield -= workersConsume;
		System.out.print(days + "\n" + yield);
	}
}
