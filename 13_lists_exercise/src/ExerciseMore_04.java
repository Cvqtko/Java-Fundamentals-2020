import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExerciseMore_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
				.collect(Collectors.toList());
		List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
				.collect(Collectors.toList());
		List<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < Math.min(firstList.size(), secondList.size()); i++) {
			result.add(firstList.get(i));
			result.add(secondList.get(Math.min(firstList.size(), secondList.size()) - 1 - i));
		}
		int firstBorder = 0;
		int secondBorder = 0;

		if (firstList.size() > secondList.size()) {
			firstBorder = firstList.get(firstList.size() - 1);
			secondBorder = firstList.get(firstList.size() - 2);
		} else {
			firstBorder = secondList.get(secondList.size() - 1);
			secondBorder = secondList.get(secondList.size() - 2);
		}

		for (int i = 0; i < result.size(); i++) {
			if (result.get(i) > Math.min(firstBorder, secondBorder)
					&& result.get(i) < Math.max(firstBorder, secondBorder)) {
				System.out.print(result.get(i) + " ");
			}
		}
	}
}
