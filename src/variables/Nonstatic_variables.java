package variables;

public class Nonstatic_variables
{
	int a=10;
	int x;
	boolean b;
	public void m1()
	{
		System.out.println(a);//call to nonstatic variable in nonstatic method in 
		                        //same class directly by name 
		
		System.out.println("non static method");
		
	}
	public static void main(String[] args)
	{
		Nonstatic_variables v1=new Nonstatic_variables();
		System.out.println(v1.a);
		System.out.println(v1.b);
		System.out.println(v1.x);
		v1.m1();//
	}

}
/*10
false
0
10
non static method*/
