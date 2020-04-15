import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Arrays.stream(scanner.nextLine().split("\\s+")).filter(w -> w.length() % 2 == 0)
				.forEach(w -> System.out.println(w));

	}
}
