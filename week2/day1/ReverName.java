package week2.day1;

public class ReverName {

	public static void main(String[] args) {
		String name = "amazon India";
		char toFind = 'a';
		int count = 0;
		
		for (int i = 0; i < name.length(); i++) {
				char charAt = name.charAt(i);
				if(charAt == toFind) {
					count++;
				}
		}
		System.out.println(count);
		
		
		
		
		
		
//		
//		for (int i = name.length() -1; i >= 0; i--) {
//			System.out.print(name.charAt(i));
//		}
		
//		char[] charArray = name.toCharArray();
//		  for (int i = charArray.length -1; i >= 0; i--) { 
//			  System.out.print(charArray[i]);
//			  temp = temp+charArray[i]; 
//			  }
//		  System.out.println(temp.toUpperCase());
//		 
		
		

	}

}
