package week4.day1;

public class Axis implements RBI, CIBIL {

	@Override // annotation
	public void aadharCardMandatory() {
		System.out.println("Aadhar mandatory");
	}
	public void aadharCardMandatory(String str) {
		System.out.println("Aadhar mandatory");
	}

	@Override
	public boolean isPanCardAttached() {
		return true;
	}

	public void insuranceOffer() {
		System.out.println("Free insurance");	
	}
	@Override
	public void maintainTwoCard() {
		System.out.println("some logic");
		
	}

}
