package constructor;

public class Const_thiskeyword
{
	public Const_thiskeyword()

	{
		this(20);
		System.out.println("I am constructor");
		
	}
	public  Const_thiskeyword( int a) 
	{
		this(12,30);
		System.out.println("I am one argument constructor");
		
	}
	public  Const_thiskeyword(int a, int b)
	{
		//this();
		System.out.println(" I am two argument constructor ");
		
	}
	public static void main(String[] args)
	{
		Const_thiskeyword obj01=new Const_thiskeyword();
		//Const_thiskeyword obj02=new Const_thiskeyword(int a);
		
	}
}
		
	


