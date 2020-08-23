package laernMap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {
	public static void main(String[] args) {

		String name = "amazon india pvt limited";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] charArray = name.toCharArray();
		for (char c : charArray) {
			boolean containsKey = map.containsKey(c);
			if (containsKey) {
				Integer value = map.get(c);
				map.put(c, value+1);
			}
			else
				map.put(c, 1);
		}
		System.out.println(map);
	}

	public static void main1(String[] args) {
		Map<Integer, String> myEmp = new LinkedHashMap<Integer, String>();
		boolean containsKey = myEmp.containsKey(10010);
		myEmp.put(10010, "koushik");
		myEmp.put(10010, "koushik c");
		myEmp.put(10020, "Merris");
		myEmp.put(10012, "Priyanka");
		myEmp.put(10030, "Ashutosh");
		myEmp.put(10014, "Vivek");
		myEmp.put(10045, "Sakshi");
		myEmp.put(10016, "Shefali");
		myEmp.put(10017, "Tushar");
		myEmp.put(10018, "Zhang");
		System.out.println(myEmp);
		if(containsKey) {
			String string = myEmp.get(10010);
			System.out.println(string);
		}
		System.out.println(containsKey);
		boolean empty = myEmp.isEmpty();
		System.out.println(empty);
		//		myEmp.clear();
		Set<Entry<Integer, String>> entrySet = myEmp.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() +" ==> "+ entry.getValue());
		}

		Set<Integer> keySet = myEmp.keySet();
		for (Integer mykey : keySet) {
			System.out.println(mykey);
		}
		Collection<String> values = myEmp.values();
		for (String myVal : values) {
			System.out.println(myVal);	
		}


	}

}
