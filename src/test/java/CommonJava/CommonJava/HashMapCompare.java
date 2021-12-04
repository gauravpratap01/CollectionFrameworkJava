package CommonJava.CommonJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

	public static void main(String[] args) {
		HashMap<Integer, String> map1= new HashMap<>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map2= new HashMap<>();
		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");
		
		HashMap<Integer, String> map3= new HashMap<>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");
		
		//1. On the basis of key-value
		System.out.println(map1.equals(map2));
		System.out.println(map1.equals(map3));
		
		//2. Compare on the basis on keyset
		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map1.keySet().equals(map3.keySet())); //It will consider Key=3 only once that's why O/P is true
		
		//3. Find out extra keys
		HashMap<Integer, String> map4= new HashMap<>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");
		//First combine the keys for both maps using HashSet and then remove the keys from map1
		HashSet<Integer> combineKeys=new HashSet<>(map1.keySet());
		combineKeys.addAll(map4.keySet()); // Now keys are 1,2,3,4
		combineKeys.removeAll(map1.keySet()); //remove all keys from map1
		System.out.println(combineKeys);
		
		//4. Compare map by value
		HashMap<Integer, String> map5= new HashMap<>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");
		
		HashMap<Integer, String> map6= new HashMap<>();
		map6.put(4, "A");
		map6.put(5, "B");
		map6.put(6, "C");
		
		HashMap<Integer, String> map7= new HashMap<>();
		map7.put(1, "C");
		map7.put(2, "B");
		map7.put(3, "C");
		map7.put(4, "A");
		
		//4.a--> When Duplicates values and order in maps can't be ignored--> Use ArrayList
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values()))); //true
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values()))); //Duplicates can't be ignored- false
		
		//4.b--> When Duplicates values and order in maps can be ignored--> Use HashSet
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values()))); //true
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values()))); //Duplicates can be ignored- true
		

	}

}
