package week4.day1.inheritance;

public class MyCar {

	public static void main(String[] args) {
		Audi myAudi = new Audi();
		myAudi.reverseGear();
		myAudi.applyBrake();
		String fuelType = myAudi.fuelType("petrol");
		System.out.println("My car can have "+fuelType);
		myAudi.rooftop();
	}

}
