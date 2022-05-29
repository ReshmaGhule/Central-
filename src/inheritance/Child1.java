package inheritance;

public class Child1 extends Parent1
{
	static int a=50;
	int b=200;
	public static void main(String[] args) 
		
	{
		
	int a=500;
	int b=25;
	System.out.println(a);
	System.out.println(Child1.a);
	System.out.println(Parent1.a);
	System.out.println(b);
	Child1 c1=new Child1();
	System.out.println(c1.b);
	Parent1 p1=new Parent1();
	System.out.println(p1.b);
	
	}
 

}

//500
//50
//10
//25
//200
//20
