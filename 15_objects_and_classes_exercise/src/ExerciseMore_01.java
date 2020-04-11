import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import exercise_more_01.Employee;

public class ExerciseMore_01 {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int lines = Integer.parseInt(scanner.nextLine());

		Map<String, List<Employee>> departments = new HashMap<>();

		while (lines-- > 0) {

			String input = scanner.nextLine();

			List<String> data = Arrays.stream(input.split(" ")).collect(Collectors.toList());

			String name = data.get(0);
			double salary = Double.parseDouble(data.get(1));
			String position = data.get(2);
			String department = data.get(3);

			Employee employee = new Employee(name, salary, position, department);

			if (data.size() == 5) {
				if (input.contains("@")) {
					employee.setEmail(data.get(4));
				} else {
					employee.setAge(Integer.parseInt(data.get(4)));
				}
			} else if (data.size() == 6) {
				employee.setEmail(data.get(4));
				employee.setAge(Integer.parseInt(data.get(5)));

			}
			if (!departments.containsKey(department)) {
				departments.put(department, new ArrayList<>());
				departments.get(department).add(employee);
			} else {
				departments.get(department).add(employee);
			}
		}

		departments.entrySet().stream().sorted((a, b) -> {
			double avrFirst = a.getValue().stream().mapToDouble(Employee::getSalary).average().orElse(Double.NaN);
			double avrSecond = b.getValue().stream().mapToDouble(Employee::getSalary).average().orElse(Double.NaN);
			return Double.compare(avrSecond, avrFirst);

		}).limit(1).forEach(e -> {
			System.out.println(String.format("Highest Average Salary: %s", e.getKey()));
			e.getValue().stream().sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary())).forEach(o -> System.out
					.println(String.format("%s %.2f %s %d", o.getName(), o.getSalary(), o.getEmail(), o.getAge())));
		});

	}
}
