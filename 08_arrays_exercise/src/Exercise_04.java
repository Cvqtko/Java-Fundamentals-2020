import java.util.Arrays;
import java.util.Scanner;

public class Exercise_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
		int n = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < n % arr.length; i++) {
			int temp = arr[0];
			for (int j = 1; j < arr.length; j++) {
				arr[j - 1] = arr[j];
			}
			arr[arr.length - 1] = temp;
		}

		for (int arrEl : arr) {
			System.out.print(arrEl + " ");
		}
	}
}
