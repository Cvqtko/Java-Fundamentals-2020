import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ExerciseMore_01_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Integer> list = new LinkedList<>();
		list.add(Integer.parseInt(scanner.nextLine()));
		list.add(Integer.parseInt(scanner.nextLine()));
		list.add(Integer.parseInt(scanner.nextLine()));

		Collections.sort(list, Collections.reverseOrder());

		StringBuilder sb = new StringBuilder();
		
		for(Integer i : list) {
			sb.append(i).append(" ");
		}
		System.out.println(sb.toString());
	}
}
