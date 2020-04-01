import java.util.Scanner;

public class ExerciseMore_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String reversed = new StringBuffer(str).reverse().toString();
		System.out.println(reversed);
	}
}
