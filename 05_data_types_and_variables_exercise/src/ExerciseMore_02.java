import java.util.Scanner;

public class ExerciseMore_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double firstNum = Double.parseDouble(scanner.nextLine());
		double secondNum = Double.parseDouble(scanner.nextLine());
		double eps = 0.000001;

		if (Math.abs(firstNum - secondNum) < eps) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}