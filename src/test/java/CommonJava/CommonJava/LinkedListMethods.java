package CommonJava.CommonJava;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		// LL allow null entry
		// Dynamic collection--> So insertion and deletion is easy
		// Can have duplicate elements
		// Not synchronized/Thread safe

		LinkedList<String> names = new LinkedList<>();
		names.add("Gaurav");
		names.add("Tom");
		names.add("Nikhil");
		System.out.println("Size of Linked List: " + names.size());
		// System.out.println(names.get(0));

		Iterator<String> it = names.iterator();
		System.out.println("Iterating through while loop....");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Ended............................");

		names.add(0, "Pratap");
		System.out.println("After adding \"Pratap\" at \"Gaurav's\" position: " + names);

		LinkedList<String> users = new LinkedList<>();
		users.add("Ram");
		users.add("Lakshman");
		names.addAll(users);
		System.out.println("After adding other Collection:" + names);

		names.addFirst("FirstNode");
		names.addLast("LastNode");
		System.out.println("After adding First and Last Node: " + names);

		names.remove(1);
		System.out.println("After removing item at index 1: " + names);

		// removeFirst(), removeLast(), removeAll()

		// Print in descending order
		LinkedList<String> langLinkedList = new LinkedList<>();
		langLinkedList.add("Java");
		langLinkedList.add("C++");
		langLinkedList.add("Python");
		langLinkedList.add("Go");
		Iterator<String> it1 = langLinkedList.descendingIterator();
		while (it1.hasNext()) {
			System.out.println("Descending order: "+it1.next());
		}
		
		Collections.sort(langLinkedList);
		System.out.println("Sorted LL:"+langLinkedList);

	}

}
