package week2.day2;

public class CallStatic {
	
	public static void main(String[] args) {
		LearnStaticFunction.get();
		int b = LearnStaticFunction.a;
		System.out.println(b);
		
		LearnStaticFunction lsf = new LearnStaticFunction();
//		lsf.get();
	}

}
