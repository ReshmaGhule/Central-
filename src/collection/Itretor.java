package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Itretor
{
	public static void main(String[] args) 
	{
		ArrayList a2=new ArrayList<>();	
		
		a2.add("abc");
		a2.add(12);
		a2.add(true);
		a2.add("aaa");
		a2.add(1, "bbb");
		System.out.println(a2);
		 Iterator it=a2.iterator();
	        {
	        	while(it.hasNext())
	        	{
	        		System.out.println(it.next());
	        	}
	        }
		a2.set(0, 123);
		a2.remove(0);
		a2.remove("bbb");
        System.out.println(a2);
        
	}
		

}
//[abc, bbb, 12, true, aaa]
//abc
//bbb
//12
//true
//aaa
//[12, true, aaa]
