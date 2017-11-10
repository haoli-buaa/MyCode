package cn.buaa.haoli.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author li
 *
 */
public class DemoIterator {

	/**
	 * @param args
	 */
	static final int MAX_SIZE = 5;
	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>(5);
		for (int i = 0; i < MAX_SIZE; i++) {
			collection.add(i);
		}
		Iterator<Integer> iterator = collection.iterator();
		while (iterator.hasNext()) {
			int value = iterator.next();
			System.out.println(value);
			if ((value & 1) != 0) {
				iterator.remove();
			}
		}
			
		System.out.println(collection);

	}

}
