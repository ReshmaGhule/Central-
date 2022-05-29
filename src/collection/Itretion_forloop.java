package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Itretion_forloop
{
	public static void main(String[] args) {
		
	
	ArrayList a3=new ArrayList<>();
	a3.add(66);
	a3.add(55);
	a3.add(33);
	a3.add(44);
	System.out.println(a3);
	
	System.out.println("size of a3"   +a3.size());
	for(int i=0;i<a3.size();i++)
	{
		System.out.println(a3.get(i));
	}
	Collections.sort(a3);
	System.out.println(a3);
	for(Object aa:a3)
	{
		System.out.println(aa);
	}
	
	System.out.println("value of 0th index");
	System.out.println(a3.get(0));
}
	
	
	
}