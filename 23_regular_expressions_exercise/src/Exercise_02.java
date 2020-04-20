import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Exercise_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<String> racers = Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());
		Map<String, Integer> results = new LinkedHashMap<String, Integer>();

		String input = scanner.nextLine();

		Pattern letterPattern = Pattern.compile("[a-z]|[A-Z]");
		Pattern digitPattern = Pattern.compile("[0-9]");

		while (!"end of race".equals(input)) {
			StringBuilder name = new StringBuilder();
			Matcher nameMatcher = letterPattern.matcher(input);
			Matcher digitMatcher = digitPattern.matcher(input);
			while (nameMatcher.find()) {
				name.append(nameMatcher.group());
			}
			if (racers.contains(name.toString())) {
				results.putIfAbsent(name.toString(), 0);
				int oldKm = results.get(name.toString());
				int newKm = 0;
				while (digitMatcher.find()) {
					newKm += Integer.parseInt(digitMatcher.group());
				}
				results.put(name.toString(), oldKm + newKm);
			}

			input = scanner.nextLine();
		}
		int[] number = { 1 };
		results.entrySet().stream().sorted((r1, r2) -> r2.getValue().compareTo(r1.getValue())).limit(3).forEach(r -> {
			switch (number[0]) {
			case 1:
				System.out.println(String.format("1st place: %s", r.getKey()));
				break;
			case 2:
				System.out.println(String.format("2nd place: %s", r.getKey()));
				break;
			case 3:
				System.out.println(String.format("3rd place: %s", r.getKey()));
				break;
			}
			number[0]++;
		});
	}
}
