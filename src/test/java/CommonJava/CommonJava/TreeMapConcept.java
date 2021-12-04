package CommonJava.CommonJava;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class TreeMapConcept {

	public static void main(String[] args) {
		TreeMap<Integer, String> tMap=new TreeMap<>();
		tMap.put(1000, "Tom");
		tMap.put(2000, "Mark");
		tMap.put(3000, "Gaurav");
		tMap.put(15000, "Tarun");
		tMap.put(4000, "Clarke");
		
		System.out.println(tMap);
		//traverse
		tMap.forEach((k,v)->System.out.println("Key="+k+" and value="+v));
		System.out.println(tMap.lastKey());
		System.out.println(tMap.firstKey());
		
		Set<Integer> keysLessThan3K = tMap.headMap(3000).keySet();
		System.out.println(keysLessThan3K);
		
		Set<Integer> keysMoreThan3K =tMap.tailMap(3000).keySet();
		System.out.println(keysMoreThan3K);
		
		TreeMap<Integer, String> revTreeMap=new TreeMap<>(Comparator.reverseOrder());
		revTreeMap.put(1000, "Tom");
		revTreeMap.put(2000, "Mark");
		revTreeMap.put(3000, "Gaurav");
		revTreeMap.put(15000, "Tarun");
		revTreeMap.put(4000, "Clarke");
		System.out.println(revTreeMap);
		
		TreeMap<String, Integer> userMap=new TreeMap<>();
		userMap.put("James", 100);
		userMap.put("Brad", 200);
		userMap.put("Albert", 400);
		userMap.put("George", 50);
		userMap.put("Larry", 900);
		userMap.put("Ted", 120);
		userMap.put("Paul", 300);
		
		userMap.forEach((k,v)->System.out.println("Key="+k+" and value="+v)); // Will print alphabetical order of Keys
		

	}

}
