package CommonJava.CommonJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListsMethods {

	public static void main(String[] args) {

		ArrayList<String> ar1 = new ArrayList<>();
		ar1.add("Testing");
		ar1.add("DevOps");
		ArrayList<String> ar2 = new ArrayList<>();
		ar2.add("Automation");
		// ar1.addAll(ar2);
		ar1.addAll(1, ar2); // start adding from a particular index
		System.out.println(ar1);
		ar1.clear();
		System.out.println(ar1);

		ArrayList<String> arOrg = new ArrayList<>(Arrays.asList("Hi", "How", "Are", "You", "Hi"));
		ArrayList<String> cloneList = (ArrayList<String>) arOrg.clone(); // Clone will return an Object so need to
																			// typecast it into ArrayList
		System.out.println(cloneList);
		System.out.println(cloneList.contains("How"));
		System.out.println(cloneList.indexOf("Are"));
		System.out.println("Last Index of: " + arOrg.lastIndexOf("Hi"));

		cloneList.remove(1);
		cloneList.remove("You");
		System.out.println(cloneList);

		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		number.removeIf(num -> num % 2 == 0); // can be used to find odd numbers in a list
		System.out.println(number);

		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Java", "Python", "C", "C++", "Java"));
		System.out.println(arrayList);
		arrayList.retainAll(Collections.singleton("Java"));
		System.out.println(arrayList);

		ArrayList<Integer> numberOrg = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		ArrayList<Integer> numbSubList = new ArrayList<>(numberOrg.subList(2, 5));
		System.out.println(numbSubList);

		ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("Java", "Python", "C", "C++"));
		Object[] arr = arrayList1.toArray();
		System.out.println(Arrays.toString(arr));
		for (Object o : arr) {
			System.out.println((String)o); //type cast into from Object to String, to perform any String operations 
		}
		
		ArrayList<Integer> sampleArrayList=new ArrayList<>(Arrays.asList(1,2,4,5));
		System.out.println("Sample ArrayList: "+sampleArrayList); //1,2,3,5
		
		sampleArrayList.add(2, 3);
		System.out.println("Sample ArrayList: "+sampleArrayList); //1,2,3,4,5--> add will shift and then add the element
		sampleArrayList.set(0, 6);
		System.out.println("Sample ArrayList: "+sampleArrayList); //1,2,3,4,5 --> Set will replace the value at that index

	}

}
