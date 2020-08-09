package week4.day1.inheritance;

public class Vehicle {
	
	public void applyBrake() {
		System.out.println("Vehicle Applied brake");
	}
	public String fuelType(String fuel) {
		if(fuel.equals("petrol")) {
			return "Petrol";
		}else {
			return "diesel";
		}
	}

}
