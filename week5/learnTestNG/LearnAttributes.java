package week5.learnTestNG;

import org.testng.annotations.Test;

public class LearnAttributes {
	/**
	 * 0. Invocation count = n times to run
	 * 1. run in the alphabetical order
	 * 2. Priority
	 * 3. dependsOnMethods = "week5.learnTestNG.LearnAttributes.code"
	 * 4. enabled =  false
	 * 5. alwaysRun = true
	 */
	
	
	@Test()
	public void eat(){
		System.out.println("eat");
		// test 1
	}
	@Test()
	public void sleep(){
		System.out.println("sleep");
		// test 2
	}
	@Test(priority = -2)
	public void code(){
		System.out.println("code");
//		throw new RuntimeException();
	}
	@Test()
	public void repeat(){
		System.out.println("repeat");
		// test 4
	}

}
