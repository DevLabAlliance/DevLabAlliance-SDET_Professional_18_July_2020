package week4.day1;

public interface RBI {
	// by default everything is public
	
	// all variables are static final
	int minimumBalance = 3000;	
	// abstract method
	public void aadharCardMandatory();
	
	boolean isPanCardAttached();
	
	/*
	 * public static void maxTransaction() { System.out.println("5000"); } public
	 * default void minTrans() { System.out.println("5000"); }
	 */
}
