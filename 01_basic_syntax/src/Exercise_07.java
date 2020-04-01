import java.util.Scanner;

public class Exercise_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String dayType = scanner.nextLine();
		int age = Integer.parseInt(scanner.nextLine());
		int ticketPrice = 0;

		if (0 <= age && age <= 18) {
			switch (dayType) {
			case "Weekday":
				ticketPrice = 12;
				break;
			case "Weekend":
				ticketPrice = 15;
				break;
			case "Holiday":
				ticketPrice = 5;
				break;
			}
		} else if (18 < age && age <= 64) {
			switch (dayType) {
			case "Weekday":
				ticketPrice = 18;
				break;
			case "Weekend":
				ticketPrice = 20;
				break;
			case "Holiday":
				ticketPrice = 12;
				break;
			}
		} else if (64 < age && age <= 122) {
			switch (dayType) {
			case "Weekday":
				ticketPrice = 12;
				break;
			case "Weekend":
				ticketPrice = 15;
				break;
			case "Holiday":
				ticketPrice = 10;
				break;
			}
		}

		if (ticketPrice == 0) {
			System.out.println("Error!");
		} else {
			System.out.println(ticketPrice);
		}
	}
}
