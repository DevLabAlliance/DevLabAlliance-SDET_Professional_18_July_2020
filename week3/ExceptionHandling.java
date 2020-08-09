package week3;

import java.io.File;

import org.openqa.selenium.NoSuchElementException;

public class ExceptionHandling {
	
	// NoSuchElement
	// NOSuchAlertException
	
	
	public static void eat() {
		
		int[] a= new int[10];
//		a[11]
		try {
			Thread.sleep(3000);
			System.out.println("eating");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println("some error occurs");
		}
	}
	
	public static void code() {
		eat();
//		try {
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	public static void sleep()  {
		code();
	}
	
	public static void main(String[] args){
		sleep();
	}

}
