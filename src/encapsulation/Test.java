package encapsulation;

public class Test
{
	private int a=10;
	private int b=20;
	private String name="xyz";
	public int m1()//GETTER METHOD
	{
		return a;
	}

	public static void main(String[] args) 
	{
		Test t1= new Test();
		System.out.println(t1.m1());
	}

	
	}

