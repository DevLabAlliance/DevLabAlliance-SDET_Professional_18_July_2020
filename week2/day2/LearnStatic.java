package week2.day2;

public class LearnStatic {



	public LearnStatic() {
		System.out.println("I am in constructor");
	}


	public static void main(String[] args) { 
		new LearnStatic();
		System.out.println("I am in main method");
	}

	static {
		System.out.println("static block");
	}

}
