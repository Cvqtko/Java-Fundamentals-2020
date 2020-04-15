import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] words = scanner.nextLine().split("\\s+");
		LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

		for (String word : words) {
			String wordLowerCase = word.toLowerCase();
			counts.putIfAbsent(wordLowerCase, 0);
			counts.put(wordLowerCase, counts.get(wordLowerCase) + 1);

		}
		ArrayList<String> odds = new ArrayList<String>();

		for (var entry : counts.entrySet()) {
			if (entry.getValue() % 2 != 0) {
				odds.add(entry.getKey());
			}
		}

		System.out.println(String.join(", ", odds));

	}
}
