package week1.day2;

public class Mob {
	
	public Mob() {
	}
	public Mob(int num) {
		this.myPhone = num;
	}
	int myPhone;
	
	public int callNumber(int myPhone) {
        System.out.println("calling .... "+this.myPhone);
        return myPhone;
    }
	public static void main(String[] args) {
		Mob m = new  Mob(85);
		int a = m.callNumber(789);
		System.out.println(a);
	}
}
