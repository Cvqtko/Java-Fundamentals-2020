import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExerciseMore_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		line = line.replaceAll(" ", "");
		String[] tikkets = line.split(",");
		Pattern pattern = Pattern.compile("(\\@{6,}|\\${6,}|\\^{6,}|\\#{6,})");

		for (int i = 0; i < tikkets.length; i++) {
			if (tikkets[i].length() != 20) {
				System.out.println("invalid ticket");
				continue;
			}

			String tikketLeftHalf = tikkets[i].substring(0, 10);
			Matcher leftHalf = pattern.matcher(tikketLeftHalf);

			String tikketRightHalf = tikkets[i].substring(10);
			Matcher rightHalf = pattern.matcher(tikketRightHalf);

			if (leftHalf.find() && rightHalf.find()) {
				char winningSymbol = tikkets[i].charAt(leftHalf.start());
				int winningSum = Math.min(leftHalf.end() - leftHalf.start(), rightHalf.end() - rightHalf.start());
				if (winningSum == 10) {
					System.out.printf("ticket %s - %d%c Jackpot!\n", tikkets[i], winningSum, winningSymbol);
				} else {
					System.out.printf("ticket %s - %d%c\n", tikkets[i], winningSum, winningSymbol);
				}
			}else {
				System.out.printf("ticket %s - no match\n", tikkets[i]);
			}

		}

	}
}
