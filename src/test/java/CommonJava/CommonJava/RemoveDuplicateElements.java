package CommonJava.CommonJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {	
		
		//1.LinkedHashSet
		ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(1,1,2,3,3,4,5,6,3,4,5,7,8,7,5,7,8,9));
		LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> numbListNoDup=new ArrayList<Integer>(linkedHashSet);
		System.out.println(numbListNoDup);
		
		//2. JDK-8 Stream
		ArrayList<Integer> marks= new ArrayList<Integer>(Arrays.asList(1,1,2,3,3,4,5,6,3,4,5,7,8,7,5,7,8,9));
		List<Integer> uniqList = marks.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqList);
	}

}
