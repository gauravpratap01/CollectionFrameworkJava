package CommonJava.CommonJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class HashMapToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> compMap = new HashMap<String, Integer>();
		compMap.put("Google", 1000000);
		compMap.put("Apple", 2000000);
		compMap.put("Facebook", 3000000);
		compMap.put("Netflix", 4000000);
		System.out.println(compMap.size());

		Iterator<Entry<String, Integer>> it = compMap.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Integer> entry = it.next();
			System.out.println("Key=" + entry.getKey() + " and Value=" + entry.getValue());
		}

		// Convert HashMap's keys into list
		List<String> compNameList = new ArrayList<>(compMap.keySet());
		for (String c : compNameList) {
			System.out.println(c);
		}

		// Convert HashMap's values into list
		List<Integer> compValueList = new ArrayList<>(compMap.values());
		for (Integer c : compValueList) {
			System.out.println(c);
		}

	}

}
