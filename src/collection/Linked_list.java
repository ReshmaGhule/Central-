package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_list
{
	public static void main(String[] args) {
		
		LinkedList<Integer>lList=new LinkedList<>();
		
		lList.add(15);
		lList.add(55);
		lList.add(10);
		lList.add(21);
		System.out.println(lList);
		lList.add(0,7);
		System.out.println(lList);
		lList.add(32);
		System.out.println(lList);
		ArrayList<Integer>arlist1=new ArrayList<>();
		arlist1.add(5);
		arlist1.add(20);
		System.out.println("arraylist1");
		System.out.println(arlist1);
		System.out.println("addition of arraylist to linkedlist");
		lList.addAll(2,arlist1);
		System.out.println(lList);
		lList.addFirst(21);
		lList.addLast(66);
		System.out.println("linkedList after adding first n last element ");
		System.out.println(lList);
		
		
		System.out.println(lList.contains(55));
		System.out.println(lList.get(3));
		System.out.println(lList.getFirst());
		System.out.println(lList.getLast());
		System.out.println(lList.indexOf(5));

		lList.clear();
		System.out.println("after clearing List");
		System.out.println(lList);
		
	}

}
