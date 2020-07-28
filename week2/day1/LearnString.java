package week2.day1;

public class LearnString {
	
	
	public static void main(String[] args) {
		

		String name = "DeV LABS Chennai";
		
		System.out.println(name.contains("labs"));
		
		
		// string literal
		String myName = "dev LABS Delhi";
		
		
//		System.out.println(name.startsWith("Ved"));
		
		System.out.println(name.endsWith("i"));
		
		/*
		 * System.out.println(name.substring(4)); String[] split = name.split("e"); for
		 * (String string : split) { System.out.println(string); }
		 */
		
		
		
		
		
		
		
		
		
		
		String myNumber = "12345";
		String myNumber1 = "12345";
//		System.out.println(myNumber.equals(myNumber1));
		
		
//		System.out.println(name+myName);
		System.out.println(name.concat(myName));
		
		System.out.println(name.substring(4,8 ));
		
//		System.out.println(name.replace("Chennai", "Delhi"));
		
		
//		String myData = "koushik";
//		
//		System.out.println(name.equalsIgnoreCase(myName));
		
		
		
		
		// ctrl + 2, l
		char[] charArray = name.toCharArray();
		for (char c : charArray) {
//			System.out.println(c);
		}
	
		
//		int len = name.length();
//		System.out.println(name.charAt(len-1));
		
		
		
//		System.out.println(name.length());
		
		
		/*
		 * String words[] = name.split(" "); System.out.println(words.length); for
		 * (String word : words) { System.out.println(word); }
		 */
		
		
//		System.out.println(name.trim());
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(name.toLowerCase());
		
		
		
		
	}

}
