package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist_itretor 
{
	 public static void main(String[] args)
	 {
		
	
		
		ArrayList arlist2=new ArrayList();
		arlist2.add(13);
        arlist2.add(30);
        arlist2.add(40);
        arlist2.add(3);
        System.out.println( arlist2);
        System.out.println("after sorting");
        Collections.sort(arlist2);
        arlist2.set(1,15);
         System.out.println( arlist2);
         arlist2.remove(2);
         System.out.println( arlist2);
       Iterator it= arlist2.iterator();
        {
        	
        while(it.hasNext())
        {
        	System.out.println(it.next());
        
	}


	 }
}
}
