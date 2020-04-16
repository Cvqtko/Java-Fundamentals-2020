import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import exercise_more_05.Dragon;

public class ExerciseMore_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		Map<String, List<Dragon>> dragons = new LinkedHashMap<>();
		while (n-- > 0) {
			String[] tokens = scanner.nextLine().split("\\s+");
			String type = tokens[0];
			String dragonName = tokens[1];
			int damage = "null".equals(tokens[2]) ? 45 : Integer.parseInt(tokens[2]);
			int health = "null".equals(tokens[3]) ? 250 : Integer.parseInt(tokens[3]);
			int armor = "null".equals(tokens[4]) ? 10 : Integer.parseInt(tokens[4]);
			if (!dragons.containsKey(type)) {
				dragons.put(type, new LinkedList<Dragon>());
			}
			boolean overwriteDragon = false;
			if (dragons.containsKey(type)) {
				for (Dragon dragon : dragons.get(type)) {
					if (dragon.getName().equals(dragonName)) {
						dragon.setDamage(damage);
						dragon.setHealth(health);
						dragon.setArmor(armor);
						overwriteDragon = true;
						break;

					}
				}
			}
			if (!overwriteDragon) {
				dragons.get(type).add(new Dragon(dragonName, damage, health, armor));
			}
		}
		dragons.entrySet().stream().forEach(type -> {
			double damage = type.getValue().stream().mapToDouble(d -> d.getDamage()).average().getAsDouble();
			double health = type.getValue().stream().mapToDouble(d -> d.getHealth()).average().getAsDouble();
			double armor = type.getValue().stream().mapToDouble(d -> d.getArmor()).average().getAsDouble();
			System.out.println(String.format("%s::(%.2f/%.2f/%.2f)", type.getKey(), damage, health, armor));
			type.getValue().stream().sorted((d1, d2) -> d1.getName().compareTo(d2.getName()))
					.forEach(d -> System.out.println(String.format("-%s -> damage: %d, health: %d, armor: %d",
							d.getName(), d.getDamage(), d.getHealth(), d.getArmor())));
		});
	}
}