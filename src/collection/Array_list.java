package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_list

{
	
public static void main(String[] args) {
	
ArrayList a1=new ArrayList();
    a1.add(10);
    a1.add(17);
    a1.add(20);
    a1.add(1,15);
   
	System.out.println(a1);
	System.out.println(a1.size());
	System.out.println("before sorting");
	for(int i=0;i<a1.size();i++)
{
	System.out.println(a1.get(i));
}
	Collections.sort(a1);
	 a1.set(0, 22);
	System.out.println("after sorting");
	System.out.println(a1);
	for(Object aa:a1)
	{
		System.out.println(aa);
	}
	

}
	
}


