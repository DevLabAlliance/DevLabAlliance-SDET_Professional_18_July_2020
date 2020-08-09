package week4.day1.inheritance;

public class Audi extends Car{
	
	public void rooftop() {
		System.out.println("opening roof");
	}
	// runtime - override
	public void applyBrake() {
		super.applyBrake();
		System.out.println("AUDI Applied brake");
	}
	

}
