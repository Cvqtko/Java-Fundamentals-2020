import java.util.Scanner;

import exercise_02.Article;

public class Exercise_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(", ");
		String title = input[0];
		String content = input[1];
		String author = input[2];
		Article article = new Article(title, content, author);

		int n = Integer.parseInt(scanner.nextLine());

		while (n-- > 0) {
			input = scanner.nextLine().split(": ");
			String command = input[0];
			// "Edit: {new content}"; "ChangeAuthor: {new author}"; "Rename: {new title}
			switch (command) {
			case "Edit":
				article.edit(input[1]);
				break;
			case "ChangeAuthor":
				article.changeAuthor(input[1]);
				break;
			case "Rename":
				article.rename(input[1]);
				break;
			}

		}
		System.out.println(article.toString());
	}

}
