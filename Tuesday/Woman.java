public class Woman extends Person {

	public Woman(String name, double height) {
		super(name, height);
	}

	//Override - felülírom
	public String getHobby() {
		return "Cooking.";
	}
}
