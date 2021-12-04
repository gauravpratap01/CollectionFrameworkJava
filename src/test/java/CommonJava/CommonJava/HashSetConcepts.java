package CommonJava.CommonJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcepts {

	public static void main(String[] args) {
		Set<String> hSet = new HashSet<>();
		hSet.add("Java");
		hSet.add("Java");
		hSet.add("Python");
		hSet.add("Python");
		hSet.add("Ruby");
		System.out.println("Set is: " + hSet);
		for (String e : hSet) {
			System.out.println("Iterate through For Loop: " + e);
		}
		Iterator<String> it = hSet.iterator();
		while (it.hasNext()) {
			System.out.println("Through Iterator: " + it.next());
		}

		hSet.remove("Java");
		System.out.println("After removing Java: " + hSet);
		
		Set<Integer> first=new HashSet<>();
		first.addAll(Arrays.asList(new Integer[] {1,3,5,7,9,11}));
		
		Set<Integer> second=new HashSet<>();
		second.addAll(Arrays.asList(new Integer[] {1,2,4,6,8,10,11}));
		
		//Union
		Set<Integer> union=new HashSet<>(first);
		union.addAll(second);
		System.out.println("After Union: "+union);
		
		//Intersection
		Set<Integer> intersection=new HashSet<>(first);
		intersection.retainAll(second);
		System.out.println("After Intersection: "+intersection);
		
		//Difference
		Set<Integer> diff=new HashSet<>(first);
		diff.removeAll(second);
		System.out.println("Difference of (First-Second): "+diff);
		
		Set<Integer> third=new HashSet<>(Arrays.asList(new Integer[] {1,2,3,3}));
		System.out.println("Third Collection: "+third);
		

	}

}
