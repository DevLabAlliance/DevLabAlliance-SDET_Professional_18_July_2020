package learnList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<String> fruits = new HashSet<String>();
		boolean add = fruits.add("apple");
		System.out.println("first apple: "+add);
		fruits.add("pine");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("grape");
		fruits.add("staw");
		System.out.println(fruits.add("apple"));
		// apple
		fruits.remove("pine");

		boolean contains = fruits.contains("apple");

		System.out.println(fruits);

		System.out.println(fruits.size());
		
		List<String> list = new ArrayList<String>();
		list.addAll(fruits);
		System.out.println(list.size());

		System.out.println(list.get(0));
		
		
//		fruits.clear();
//		System.out.println(fruits.isEmpty());

		// no get in set
		//		fruits.get

	}

}




