import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		int day = Integer.parseInt(sc.nextLine());

		if (day >= 1 && day <= 7) {
			System.out.println(days[day - 1]);
		} else {
			System.out.println("Invalid day!");
		}
	}
}
