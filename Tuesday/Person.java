public class Person {

	//Declearation of class variables
	String name;
	double height;
	String hobby;
	
	//Consctructor -- method()
	//->Only allow instantion with giving name and height!
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}

	//GETTERS
	/*nincs paraméter mert így hivom majd meg: person1.getname();
	tehát a példány-ra vonatkozóan tehát kellene this. -->
	nem kötelező, de így logikus! */
	public String getName() {
		return this.name;
	}

	public double getHeight() {
		return this.height;
	}

	public String getHobby() {
		return this.hobby;
	}

	//SETTERS
	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
