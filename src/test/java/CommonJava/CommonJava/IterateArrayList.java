package CommonJava.CommonJava;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Hello");
		arrayList.add("Hi");
		arrayList.add("How");
		arrayList.add("Why");

		// 1. Through normal for loop
		// 2. Through for each loop
		for (String a : arrayList) {
			System.out.println(a);
		}
		System.out.println("**********");

		// 3. Through Stream with lambda of java8
		arrayList.stream().forEach(ele -> System.out.println(ele));

		System.out.println("**********");

		// 3. Through Iterator
		Iterator<String> it = arrayList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
