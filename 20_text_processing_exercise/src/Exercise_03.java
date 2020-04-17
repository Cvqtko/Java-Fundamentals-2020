import java.util.Scanner;

public class Exercise_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String path = scanner.nextLine();
		int slashIndex = path.lastIndexOf('\\');
		int pointIndex = path.lastIndexOf('.');

		String name = path.substring(slashIndex + 1, pointIndex);
		String extension = path.substring(pointIndex + 1);

		System.out.println(String.format("File name: %s\r\n" + "File extension: %s\r\n" + "", name,extension));
	}
}
