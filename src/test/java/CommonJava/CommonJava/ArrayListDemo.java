package CommonJava.CommonJava;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		//With Generics
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add(100);
		arrayList.add("Hello");
		arrayList.add(true);
		System.out.println(arrayList);
		System.out.println(arrayList.get(0).getClass());
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.size());

		// Without Generics
		ArrayList arrayList2 = new ArrayList<>();
		arrayList2.add(100);
		arrayList2.add("String");
		System.out.println(arrayList2.get(0).getClass());
		System.out.println(arrayList2.get(1).getClass());
		
		ArrayList<Double> arrayList3 = new ArrayList<>();
		arrayList3.add(105.123);
		//arrayList3.add(100);--> will not store integer in a double list and throw error
		
		//List with other collection
		ArrayList<Integer> arrayList4=new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(arrayList4);

	}

}
