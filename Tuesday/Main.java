public class Main {

	public static void main(String[] args) {
		//Instantiation -- Példányosítás
		Person person1 = new Man("József", 1.9);
		Person person2 = new Woman("Katalin", 1.7);
		
		System.out.println("The name of person1 is: "
		+ person1.getName());

		System.out.println("The name of person2 is: "
		+ person2.getName() + " and the height is: "
		+ person2.getHeight());	
	}
}
