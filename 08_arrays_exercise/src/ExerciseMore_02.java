import java.util.Arrays;
import java.util.Scanner;

public class ExerciseMore_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int triangleRows = Integer.parseInt(scanner.nextLine());

		int[][] jaggedArray = new int[triangleRows][];

		jaggedArray[0] = new int[1];
		jaggedArray[0][0] = 1;

		for (int row = 1; row < jaggedArray.length; row++) {
			jaggedArray[row] = new int[row + 1];
			jaggedArray[row][0] = 1;
			jaggedArray[row][jaggedArray[row].length - 1] = 1;

			for (int col = 1; col < jaggedArray[row].length - 1; col++) {
				int leftDiagonal = jaggedArray[row - 1][col - 1];
				int rightDiagonal = jaggedArray[row - 1][col];

				jaggedArray[row][col] = leftDiagonal + rightDiagonal;
			}
		}

		for (int row = 0; row < jaggedArray.length; row++) {
			for (int col = 0; col < jaggedArray[row].length; col++) {
				System.out.print(jaggedArray[row][col] + " ");
			}
			System.out.println();
		}
	}
}