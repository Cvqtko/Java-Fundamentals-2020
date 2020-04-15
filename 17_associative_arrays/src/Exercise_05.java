import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Arrays.stream(scanner.nextLine().trim().split("\\s+")).map(Integer::parseInt).sorted((n1, n2) -> n2.compareTo(n1))
				.limit(3).forEach(n -> System.out.print(n + " "));
	}
}
