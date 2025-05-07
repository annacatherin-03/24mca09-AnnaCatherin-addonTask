package task;

import java.util.Scanner;

public class Task18 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the string below:");
		String text = scanner.nextLine();
		String reverseText = "";
		
		// Loop from last character to first
		for (int i = text.length() - 1, j = 0; i >= 0; i--, j++) {
			// Add each character to reverseText
			reverseText += text.charAt(i);
		}
		
		System.out.println("Reversed Text: " + reverseText);
		scanner.close();
	}
}