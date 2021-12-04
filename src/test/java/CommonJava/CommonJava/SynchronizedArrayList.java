package CommonJava.CommonJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {

		// Method-1 Using Collections.synchronized
		List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
		nameList.add("Java");
		nameList.add("Python");
		nameList.add(".net");

		// Add Or Remove- No need to explicit synchronization
		// Fetch/Traverse- Need explicit synchronization

		synchronized (nameList) {
			Iterator<String> it = nameList.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());

			}
		}
		
		//Method-2 using CopyOnWriteArrayList class
		CopyOnWriteArrayList<String> emp=new CopyOnWriteArrayList<String>();
		emp.add("Gaurav");
		emp.add("Tarun");
		emp.add("Sahil");
		
		// Add or Remove or Fetch- no need of explicit synchronization, it's thread safe by default
		Iterator<String> it = emp.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}

}
