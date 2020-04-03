import java.util.Scanner;

public class Exercise_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstName = scanner.nextLine();

		String lastName = scanner.nextLine();

		String delimiter = scanner.nextLine();

		String result = firstName + delimiter + lastName;

		System.out.println(result);
	}
}
