package iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(12);
		list.add(90);
		list.add(33);
		System.out.println("list");
		System.out.println(list.get(1));
		System.out.println(list.set(1, 19));
		System.out.println(list);
		System.out.println(list.remove(2));
		System.out.println(list);
		System.out.println("=================");
		Iterator<Integer>it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
