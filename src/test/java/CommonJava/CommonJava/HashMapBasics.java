package CommonJava.CommonJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		
		//No Order, no indexing
		//Key cannot be duplicate, will take the latest key
		//Can store only one NULL key, but can store multiple NULL values
		// HasMap not thread-safe
		HashMap<String, String> capital=new HashMap<>();
		capital.put("India", "Delhi");
		capital.put("UK", "London");
		//System.out.println(capital);
		capital.put("UK", "London123"); //Will take latest key
		System.out.println(capital.get("UK"));
		capital.put(null, "Berlin");
		capital.put(null, "Oslo");
		System.out.println(capital.get(null)); //Will take latest null key
		capital.put("US", null);
		capital.put("Singapore", null);
		System.out.println(capital.get("US"));  //can have multiple null values
		System.out.println(capital.get("Singapore")); //can have multiple null values
		
		System.out.println("********************");
		
		//Iterate the Map
		//Method-1 Through KeySet
		Iterator<String> it1 = capital.keySet().iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			String value = capital.get(key);
			System.out.println("Key="+key+" and Value="+value);			
		}
		System.out.println("********************");
		
		//Method-2 Iterate over a entire EntrySet(pair- key and Value)
		Iterator<Entry<String, String>> it2 = capital.entrySet().iterator();
		while (it2.hasNext()) {
			Entry<String, String> entry = it2.next();
			System.out.println("Key="+entry.getKey()+" and Value="+entry.getValue());			
		}
		System.out.println("********************");
		
		//Method-3 JDK-8 Stream API
		capital.forEach((k,v)->System.out.println("Key="+k+" and Value="+v));
		
		

	}

}
