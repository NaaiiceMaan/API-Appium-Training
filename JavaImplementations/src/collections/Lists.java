package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); 
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		int[] arr = {10,20,30,40,50};
		System.out.println("list: "+list);
		System.out.print("array: ");
		for(int item:arr)
		System.out.print(item+", ");
		System.out.println();
		Integer[] arrlist = new Integer[list.size()];
		list.toArray(arrlist);
		System.out.print("arraylist converted to array: ");
		for(Integer i:arrlist)
		System.out.print(i+", ");
		System.out.println();
		list.clear();
		for(int items:arr)
			list.add(items);
		System.out.print("array converted to arraylist: "+list);

	}

}
