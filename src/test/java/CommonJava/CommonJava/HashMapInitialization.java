package CommonJava.CommonJava;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {

	public static void main(String[] args) {
		//1. Using HashMap class
		HashMap<String, String> map1=new HashMap<>();
		Map<String, String> map2=new HashMap<>();
		
		//2. Immutable Map with only Single entry
		//Immutable Maps are thread safe		
		Map<String, Integer> map3 = Collections.singletonMap("test", 100);
		System.out.println(map3.get("test"));
		//map3.put("test12", 200); //UnsupportedOperationException, can not add/delete/update,it's read-only map
		
		//3. Through JDK-8-> Create a 2D String type of Array through Stream and Collect it to a Map
		Map<String, String> map4=Stream.of(new String[][] {
			{"Maths","A+"},
			{"English","B+"}
		}).collect(Collectors.toMap(data->data[0], data->data[1]));
		System.out.println(map4.get("English"));
		
		//Map using Guava API--> You can create Mutable and Immutable maps with this API
	}

}
