import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercise_03.Person;

public class Exercise_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Person> people = new ArrayList<Person>();

		int n = Integer.parseInt(scanner.nextLine());

		while (n-- > 0) {
			String[] input = scanner.nextLine().split("\\s+");
			String name = input[0];
			int age = Integer.parseInt(input[1]);
			Person person = new Person(name, age);
			people.add(person);
		}

		people.stream().filter(p -> p.getAge() > 30).sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
				.forEach(p -> System.out.println(p.toString()));
	}

}
