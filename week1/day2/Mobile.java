package week1.day2;

public class Mobile {
	
	public Mobile() {
		System.out.println("hey");
	}

	// accessModifier ClassName()

	public Mobile(String mobileName) {
		this.mobileName = mobileName;
		System.out.println("Hey I am in constructor");
	}


	String mobileName = "One plus";




	public String getName() {
		return this.mobileName;
	}

}
