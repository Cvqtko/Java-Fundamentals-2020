import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExerciseMore_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		List<Integer> numbers = new ArrayList<Integer>();
		List<Integer> takeList = new ArrayList<Integer>();
		List<Integer> skipList = new ArrayList<Integer>();
		String wordWithoutNum = "";

		for (int i = 0; i < word.length(); i++) {

			if (Character.isDigit(word.charAt(i))) {
				numbers.add(Integer.parseInt(word.charAt(i) + ""));
			} else {
				wordWithoutNum += word.charAt(i);
			}

		}
		for (int i = 0; i < numbers.size(); i++) {
			if (i % 2 == 0) {
				takeList.add(numbers.get(i));
			} else {
				skipList.add(numbers.get(i));
			}
		}

		int indexForSkip = 0;
		String result = "";
		for (int i = 0; i < takeList.size(); i++) {
			String sub = wordWithoutNum.substring(indexForSkip,
					Math.min(indexForSkip + takeList.get(i), wordWithoutNum.length()));
			result += sub;
			indexForSkip = indexForSkip + skipList.get(i) + takeList.get(i);
		}
		System.out.println(result);
	}
}