package learnList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fruits{

	public static void main(String[] args) {


		//		int a[] = new int[1];
		//		a[0] = 1;
		// generic <>

		List<String> fruits = new ArrayList<String>();
		boolean add = fruits.add("apple");
		fruits.add("pine");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("grape");
		fruits.add("staw");
		System.out.println(fruits);
		Collections.sort(fruits);
		System.out.println(fruits);
		
		
		
		
		
		
		
		
		
		
		
		
		
//		fruits.add("@@@");
//		fruits.add("pine");
//		fruits.add("mango");
//		fruits.add("banana");
//		fruits.add("grape");
//		fruits.add(0, "orange");
//		fruits.remove(0);
//		System.out.println(fruits);

//		int size = fruits.size();
//		System.out.println(size);
//		String myF = fruits.get(2);
//		System.out.println(myF);
//		boolean contains = fruits.contains("Banana");
//		System.out.println(contains);
//		fruits.add("pine");
//		System.out.println(fruits);
//		System.out.println("Before rem");
//		for (String oneFruit : fruits) {
//			System.out.println(oneFruit);
//		}
//		boolean remove = fruits.remove("pine");
//		System.out.println("is removed: "+remove);
//		System.out.println("aftrer rem");
//		for (String oneFruit : fruits) {
//			System.out.println(oneFruit);
//		}
//		fruits.clear();
//		System.out.println(fruits.isEmpty());
	}



}







