package collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		
		map1.put(1, "John");
		map1.put(2, "Jane");
		map1.put(3, "Leana");
		map1.put(4, "Harsh");
		map1.put(5, "Cornor");
		
		map1.put(100, "James");
		
		map1.put(5, "Sarah"); // to replace any data for key value
		
		System.out.println(map1);
		
		System.out.println("The data in 5th key is " + map1.get(5));
		
		map1.remove(100);
		
		System.out.println(map1);
		
		for(Integer key : map1.keySet()) {
			System.out.println("The key is: " + key);
			System.out.println("The data is: " + map1.get(key));
		}
		
	}

}
