package CommonJava.CommonJava;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {
		
		//1. synchronizedMap method in Collections class
		Map<String, String> map1=new HashMap<>();
		map1.put("1", "Tom");
		map1.put("2", "Mark");
		map1.put("3", "Clarke");
		
		//create synchronized map
		Map<String, String> synchMap=Collections.synchronizedMap(map1);
		System.out.println(synchMap);
		
		//2. ConcurrentHashMap class
		ConcurrentHashMap<String, String> concurrentHashMap=new ConcurrentHashMap<>();
		concurrentHashMap.put("1", "Java");
		concurrentHashMap.put("2", "Python");
		concurrentHashMap.put("3", "Ruby");
		System.out.println(concurrentHashMap);
		

	}

}
