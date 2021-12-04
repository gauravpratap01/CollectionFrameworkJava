package CommonJava.CommonJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		//1. Sort and compare
		ArrayList<String> l1=new ArrayList<String>(Arrays.asList("A","C","B","E","D"));
		ArrayList<String> l2=new ArrayList<String>(Arrays.asList("A","C","B","D","Z"));
		ArrayList<String> l3=new ArrayList<String>(Arrays.asList("A","B","C","E","D"));
		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));
		
		//2. Compare two lists- Find out additional element in a list
		ArrayList<String> l4=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l5=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		l4.removeAll(l5);
		System.out.println(l4); // Print [E]
		
		//3. Compare two lists- Find out missing element in a list
		ArrayList<String> l6=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l7=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		l7.removeAll(l6);
		System.out.println(l7); // Print [F]
		
		//4. Find out common elements
		ArrayList<String> l8=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l9=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		l8.retainAll(l9);
		System.out.println(l8);
		
		

	}

}
