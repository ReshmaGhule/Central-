package inheritance;

public class Parents extends Grandparents
{
	static int a=10;
	int b=20;
	public static  void m1()
	{
		System.out.println("m1 static method from parents class ");
	}
	public void m2()
	{
		System.out.println("m2 non static from parents class");
	}
	public static void main(String[] args) 
	{
		System.out.println(p);
		grandm1();
		m1();
		Parents c1=new Parents();
		c1.m2();
	}
}
/*100
grand parents m1 method  
m1 static method from parents class 
m2 non static from parents class*/
