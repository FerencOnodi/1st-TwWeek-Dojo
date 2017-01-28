public class Main {

	public static void main(String[] args) {
		//Instantiation -- Példányosítás
		Person person1 = new Man("József", 1.9);
		Person person2 = new Woman("Katalin", 2.2);
		Person person3 = new Man("Béla", 1.8);
		Person person4 = new Woman("Erzsébet", 1.6);

		Person[] persons = {person1, person2, person3, person4};

		for (Person person : persons) {
			System.out.println("Hi my name is " + person.getName()
			+ ", I'm " + person.getHeight() + " meters tall"
			+ " and my hobby is: " + person.getHobby());
		}

		//Print out the name and the height of the tallest person
		Person tallest = getTallest(persons);
		System.out.println("\nThe name of the heighest person is: " + tallest.getName()
		+ ", and she/he is " + tallest.getHeight() + " meters tall.");
	}

	
	//Get tallest method -- static, hogy ne kelljen példányosítani magát a Main osztályt.
	//Nem statikus method, nem kaphat statikus method-tól semmit, a scope-ok miatt nem látná.
	public static Person getTallest(Person[] persons) {
		//segédváltozók:
		double maxHeight = persons[0].getHeight();
		Person tallest = persons[0];
		
		//Iteration to find tallest
		for(Person person : persons) {
			if (maxHeight < person.getHeight()) {
				maxHeight = person.getHeight();
				tallest = person;
			}
		}
		return tallest;
	}
}
