package week4.day1;

public abstract class SC implements RBI{
	
	public boolean isPanCardAttached() {
		return true;
	}

	public void debitCard() {
		System.out.println("They are providing debit cards");
	}
	public void creditCard() {
		System.out.println("They are providing debit cards");
	}
	
	public abstract void myAbsMeth();
	
//	public abstract void first();
	
}
