import java.util.Scanner;
public class Uppercase {

	public String getString() {
		Scanner input = new Scanner();
		System.out.print("Please enter a word: ");
		String userWord = input.next();
		return userWord;
	}

	public void printString() {
		System.out.println("Your word in uppercase is: "
		+ userWord.toUpperCase();
	}
}
