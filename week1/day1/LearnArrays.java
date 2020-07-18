package week1.day1;

public class LearnArrays {

	public static void main(String[] args) {
		
		int numbers[] = {1, 5, 7, 8};
		for (int i : numbers) {
			System.out.println(i);
		}
		
		String names[] = {"kouhsik", "Vivek", "Weihua", 
				"Shefali", "Navya", "Priyanka"};
		int len = names.length;
		System.out.println(len);
//		System.out.println(names[-1]); not possible
		System.out.println("===========");
//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
		// enhanced for loop
		for (String name : names) {
			
			if (name.equals("Navya")) {
				System.out.println(name);
			}
		}

	}

}

//		String per1 = "koushik";
//		System.out.println(per1);