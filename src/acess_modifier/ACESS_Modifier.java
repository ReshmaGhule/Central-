package acess_modifier;

public class ACESS_Modifier
{
	private static int a=20;
	private void m1()
	{
		System.out.println("m1 method from ACESS_Modifier class:package is acess modifier");
	}
	protected void m2()
	{
		System.out.println();
	}
	public static void main(String[] args) {
		 ACESS_Modifier a1 = new ACESS_Modifier();
		a1.m1();//private can be acessible only in same class
	}
}

