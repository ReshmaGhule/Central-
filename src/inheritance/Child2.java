package inheritance;

public class Child2 extends Parents2
{
	static int a=50;
	int b=20;
	public void m1()
	{
		int a=100;
		int b=200;
		System.out.println(a);
		System.out.println(Child2.a);
		System.out.println(b);
		//System.out.println(this.b);// acess non static variable b
		System.out.println(super.b);//acess global variable from parent class
	}
	public static void main(String[] args) 
	{
		Child2 c1=new Child2();
		c1.m1();
		Child2 c2=new Child2();//calling of nonstatic variable
		System.out.println(c2.b);
		
	}

}
//100
//50
//200
//25
//20
