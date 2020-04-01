import java.util.Scanner;

public class Exercise_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int people = Integer.parseInt(scanner.nextLine());
		String group = scanner.nextLine();
		String day = scanner.nextLine();
		double pricePerPerson = 0;
		double totalPrice = 1;

		switch (group) {
		case "Students":
			if (people >= 30) {
				totalPrice = totalPrice * 0.85;
			}
			switch (day) {
			case "Friday":
				pricePerPerson = 8.45;
				break;
			case "Saturday":
				pricePerPerson = 9.80;
				break;
			case "Sunday":
				pricePerPerson = 10.46;
				break;
			}
			break;
		case "Business":
			if (people >= 100) {
				totalPrice = pricePerPerson * (people - 10);
			}
			switch (day) {
			case "Friday":
				pricePerPerson = 10.90;
				break;
			case "Saturday":
				pricePerPerson = 15.60;
				break;
			case "Sunday":
				pricePerPerson = 16.00;
				break;
			}
			break;
		case "Regular":
			if (people >= 10 && people <= 20) {
				totalPrice = totalPrice * 0.95;
			}
			switch (day) {
			case "Friday":
				pricePerPerson = 15;
				break;
			case "Saturday":
				pricePerPerson = 20;
				break;
			case "Sunday":
				pricePerPerson = 22.50;
				break;
			}
			break;
		}

		totalPrice = totalPrice * pricePerPerson * people;

		System.out.printf("Total price: %.2f", totalPrice);
	}
}