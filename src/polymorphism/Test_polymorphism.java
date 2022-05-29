package polymorphism;

public class Test_polymorphism extends Overloading
{
	public void m1(int a)
	{ 
		System.out.println("child class overloaded method m1:one arguments");
		
	}
	public void m1(int a,int b)
	{
		System.out.println("2 argument loaded method from child class");
		
	}
	public static void m2(int a,int b)
	{
		System.out.println("2 arguments static method from child class");
	}
	
public static void main(String[] args)
{
	Test_polymorphism t1=new Test_polymorphism();
	Overloading o1=new Overloading();
	Overloading o2=new Test_polymorphism();
	t1.m1(10);
	t1.m1(10,25);
	m2(10,20);
}
}
