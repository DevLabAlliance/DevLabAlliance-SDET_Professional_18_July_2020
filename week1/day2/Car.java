package week1.day2;

public class Car {
	
	private int mycarNumber = 1234; // instance variable // global // class level

	// properties => variable
	// behavior => methods or functions


	// apply brake
	public void applyBrake() {
		int mycarNumber = 125;
		System.out.println(this.mycarNumber);
		System.out.println("Applied brake");
	}

	String getColorName() {
		return "Black";
//		System.out.println(mycarNumber); not possible
	}

	
	String getColorName(String carName) { // overloading
		if(carName.equals("BMW")) {
			return "red";
		}
		else {
			return "Black";			
		}
	}
	/*
	 * void getSalary() { System.out.println(1213); }
	 */
	/*
	 * int getSalary() { return 1213; }
	 */

	int getCarNumber() {
//		soundHorn();
		int carNumber = 1234; // local variable
		return carNumber;
	}

	// sound horn
	private void soundHorn() {
		System.out.println("Sound");
	}

}
