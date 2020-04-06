import java.util.Arrays;
import java.util.Scanner;

public class ExerciseMore_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		 int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		 System.out.println(Arrays.toString(arr));
	}
}
