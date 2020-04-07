import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExerciseMore_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		String[] splited = input.split("\\s+");

		double firstRacerTime = 0;
		double secondRacerTime = 0;

		for (int i = 0; i < splited.length / 2; i++) {
			int addToFirstRacer = Integer.parseInt(splited[i]);
			int addToSecondRacer = Integer.parseInt(splited[splited.length-1-i]);
			if (addToFirstRacer != 0) {
				firstRacerTime += addToFirstRacer;
			} else {
				firstRacerTime *= 0.8;
			}

			if (addToSecondRacer != 0) {
				secondRacerTime += addToSecondRacer;
			} else {
				secondRacerTime *= 0.8;
			}
		}

		if (firstRacerTime < secondRacerTime) {
			System.out.printf("The winner is left with total time: %.1f", firstRacerTime);
		} else {
			System.out.printf("The winner is right with total time: %.1f", secondRacerTime);
		}
	}
}