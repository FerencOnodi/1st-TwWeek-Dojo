import java.util.Scanner;
public class Yes {
	
	//WORKS WITH COMMAND LINE ARGUMENT
	public static void main(String[] args) {
		String userInput = args[0].toLowerCase();
		
		if (userInput.equals("yes")) {
			System.out.println("Ok. You have entered the right word.");
		} else {
			System.out.println("Sorry this is not the right word...");
		}
	}


	//WORKS WITH USER INPUT FROM TERMINAL
	/*
	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a word please! ");
		String userIn = userInput.next();
		
		if(userIn.toLowerCase().equals("yes")) {
			System.out.println("Ok. You have entered the right word.");
		} else {
			System.out.println("Sorry this is not the right word...");
		}
	}*/
}
