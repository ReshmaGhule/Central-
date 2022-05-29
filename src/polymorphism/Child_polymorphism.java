package polymorphism;

public class Child_polymorphism extends Parent_polymorphism
{
	public void m1()
	{
		System.out.println("m1 is overrided method:child class");
		
	}
public void m1(int a)
{
	System.out.println("m1 is overrided method:child class");
	
}
public static void main(String[] args)
{
	Child_polymorphism c1= new Child_polymorphism();
	c1.m1();
	Parent_polymorphism p1=new Parent_polymorphism();
	p1.m1(20);
	p1.m1();
}
}
