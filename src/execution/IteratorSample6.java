package execution;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample6 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("which do you want");
		list.add("map");
		list.add("or");
		list.add("water");
		list.add("or");
		list.add("knife");
		list.add("?");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
