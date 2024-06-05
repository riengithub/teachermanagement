package teachermanagement;

import java.util.Scanner;

public class Util {
	static Scanner scanner = new Scanner(System.in);

	static String prompt(String...prompts) {
		for(String prompt : prompts) {
			System.out.println(prompt);
		}
		System.out.println();
		System.out.print(">>");
		String response = scanner.nextLine();
		System.out.println();
		return response;
	}
}
