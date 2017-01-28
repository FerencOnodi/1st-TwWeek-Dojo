public class Man extends Person {

	//Kell egy constructor, ami "egyezik" a ParentClass constructor-áva!
	//Megkapja a Person attribútumait
	public Man(String name, double height) {
		super(name, height);
	}

	//Override - felülírom
	public String getHobby() {
		return "Repairing things.";
	}
}
