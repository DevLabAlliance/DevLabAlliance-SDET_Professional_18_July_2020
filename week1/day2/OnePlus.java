package week1.day2;

class Money{
	public Money() {
		
	}
//	private Money(String){
//		
//	}
	
	int myMoney = 10000;
	
	// m1
	
}

public class OnePlus {
	
	
	int i; // instance
	String name = "d";
//	public OnePlus() {
//		// TODO Auto-generated constructor stub
//	}
//	public OnePlus(String a) {
//		// TODO Auto-generated constructor stub
//	}
	public void getMobile() {
		System.out.println(name);
	}
	
	
	public void getNumber() {
		int j;
		String a;
		System.out.println(i);
//		System.out.println(a);
//		System.out.println(j);
	}
	
	
	public static void main(String[] args) {
		OnePlus op = new OnePlus();
		op.getMobile();
		OnePlus op1 = new OnePlus();
		op1.getMobile();
//		op.getNumber();
//		Money m = new Money();
//		System.out.println(m.myMoney);
	}

}
