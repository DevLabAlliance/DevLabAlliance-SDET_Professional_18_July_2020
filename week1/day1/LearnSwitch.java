package week1.day1;

public class LearnSwitch {

	public static void main(String[] args) {

		String browser = "IE";

		switch(browser) {
		case "chrome":
			System.out.println("executing in chrome");
			break;
		case "fox":
			System.out.println("executing in fox");
			break;
		case "opera":
			System.out.println("executing in opera");
			break;
		default:
			System.out.println("browser not found");
			break;
		}
		System.out.println("completed");
		
//		int a = 0;
//		
//		switch (a) {
//		case a < 10:
//			
//			break;
//
//		default:
//			break;
//		}
//		
//		if(a< 10) {
//			System.out.println("do something");
//		}
	
		
		/*
		 * if(browser.equals("chrome")) { System.out.println("executing in chrome"); }
		 * if(browser.equals("fox")) { System.out.println("executing in firefox"); }
		 * if(browser.equals("opera")) { System.out.println("executing in Opera"); }else
		 * { System.out.println("No browser found"); }
		 */





	}

}

//		int a = 0;
//		int b = 0;
//		if(a == b) {
//			
//		}