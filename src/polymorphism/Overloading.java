package polymorphism;

public class Overloading
{
public void m1()
{
	System.out.println("m1 no arguments methood");
}
public void m1(int a)
{
System.out.println("m1 having  one argument");	
}
public void m1(int a,int b)
{
	System.out.println("m1 is two argument method");
}
public void m1(boolean b,int a)

{
	System.out.println("2 argument m1 method");
}
public void m1(int a,boolean b)
{
	System.out.println();
}
public static void main(String[] args)
{
	Overloading v1=new Overloading();
	v1.m1(10);
	v1.m1(25, 30);
	v1.m1(true,10);
	v1.m1();
}
}
/*m1 having  one argument
m1 is two argument method
2 argument m1 method
m1 no arguments methood*/
