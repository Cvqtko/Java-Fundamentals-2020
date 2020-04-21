import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] tokens = scanner.nextLine().split(",\\s+");
		List<Demon> demons = new ArrayList<>();

		for (String demon : tokens) {
			String healthRegex = "[A-Z a-z]";
			Pattern pattern = Pattern.compile(healthRegex);
			Matcher matcher = pattern.matcher(demon);
			int health = 0;
			while (matcher.find()) {
				health += matcher.group().charAt(0);
			}

			String damageRegex = "-?\\d+\\.?\\d*";
			double damage = 0.0;
			pattern = Pattern.compile(damageRegex);
			matcher = pattern.matcher(demon);
			while (matcher.find()) {
				damage += Double.parseDouble(matcher.group());
			}
			for (char c : demon.toCharArray()) {
				if (c == '*') {
					damage *= 2;
				} else if (c == '/') {
					damage /= 2;
				}

			}
			Demon demonCreated = new Demon(demon, health, damage);
			demons.add(demonCreated);
		}

		demons.stream().sorted((d1, d2) -> d1.getName().compareTo(d2.getName())).forEach(d -> System.out
				.println(String.format("%s - %d health, %.2f damage ", d.getName(), d.getHealth(), d.getDamage())));
	}
}
