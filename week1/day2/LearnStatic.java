package week1.day2;

public class LearnStatic {
	int a;
	static int b;
	String c;
	
	
	void getAge(){
		a++;
		b++;
		System.out.print("instance => "+a+" ");
		System.out.println("static => "+b);
	}

	public static void main(String[] args) {
//		System.out.println(a);
		
		LearnStatic ls = new LearnStatic();
		ls.getAge();
		ls.getAge();
		ls.getAge();
		
		LearnStatic learnS = new LearnStatic();
		learnS.getAge();
		learnS.getAge();
		learnS.getAge();
		learnS.getAge();
		
		LearnStatic learnS1 = new LearnStatic();
		learnS1.getAge();
		learnS1.getAge();
		learnS1.getAge();
		learnS1.getAge();
	
	}

}
