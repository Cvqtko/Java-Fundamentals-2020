import java.util.ArrayList;
import java.util.Scanner;

import exercise_05.Student;
import exercise_07.Person;

public class Exercise_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Person> people = new ArrayList<Person>();
		String line = scanner.nextLine();
		while (!"End".equals(line)) {
			String[] tokens = line.split("\\s+");
			String name = tokens[0];
			int id = Integer.parseInt(tokens[1]);

			int age = Integer.parseInt(tokens[2]);
			Person person = new Person(name, id, age);
			people.add(person);
			line = scanner.nextLine();
		}

		people.stream().sorted((p1, p2) -> Double.compare(p1.getAge(), p2.getAge()))
				.forEach(s -> System.out.println(s));
	}

}
