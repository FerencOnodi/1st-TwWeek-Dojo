import java.util.Scanner;
public class Uppercase {

	public String getString() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String userWord = input.next();
		return userWord;
	}

	public void printString(String userWord) {
		System.out.println("Your word in uppercase is: "
		+ userWord.toUpperCase());
	}
}
