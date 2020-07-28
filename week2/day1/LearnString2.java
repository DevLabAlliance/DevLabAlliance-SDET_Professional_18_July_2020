package week2.day1;

public class LearnString2 {
	public static void main(String[] args) {
		
		
		String str = "welcome"; // literal
		
		String strlit = "welcome";
		System.out.println(str == strlit);
		System.out.println("str literal: "+System.identityHashCode(strlit));
		System.out.println("str literal: "+System.identityHashCode(str));
		
		
//		str = "hey";
		String upperCase = str.toUpperCase();
		System.out.println(upperCase);
		System.out.println(str);
		
		
		
		// using object
		String str1 = new String("welcome");
		System.out.println("str1 obj: "+System.identityHashCode(str1));
		str1 = "dev";
		System.out.println("str1 obj: "+System.identityHashCode(str1));
		
		String str2 = new String("welcome");
		System.out.println("str2 obj: "+System.identityHashCode(str2));
		System.out.println(str2 == str1);
		
//		System.out.println(str.equals(str1));
		
		/*
		 * System.out.println(str.concat(" to dev")); System.out.println(str);
		 */
		
		/*
		 * System.out.println("++++++++++++++++"); StringBuffer buffer = new
		 * StringBuffer("welcome"); System.out.println(buffer.append(" to dev"));
		 * System.out.println(buffer);
		 */
		
		
	}

}
