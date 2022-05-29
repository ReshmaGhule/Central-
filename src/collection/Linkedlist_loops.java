package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist_loops
{
	public static void main(String[] args) 
	{
		LinkedList lList=new LinkedList<>();
		lList.add("abc");
		lList.add(12);
		lList.add(true);
		lList.add("XYZ");
		System.out.println(lList);
		System.out.println("using advanced for loop");
		for(Object a:lList)
		{
			System.out.println(a);
		}
		System.out.println("using tradtional for loop");
		for(int i=0;i<lList.size();i++)
		{
			System.out.println(lList.get(i));
		}
System.out.println("using iteretor cursor");
		Iterator it=lList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("using list iteretor cursor");
	ListIterator it1=lList.listIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}

}
