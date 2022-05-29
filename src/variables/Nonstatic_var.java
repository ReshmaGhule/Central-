package variables;

public class Nonstatic_var 
{
	int a=10;
	int c;
	boolean b;
	public static void main(String[] args) 
	{
		Nonstatic_var v1=new Nonstatic_var();
		System.out.println(v1.a);
		System.out.println(v1.c);
		System.out.println(v1.b);
	}

}
//10
//0
//false
//nonstatic variables from same class