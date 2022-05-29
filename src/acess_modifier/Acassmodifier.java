package acess_modifier;

public class Acassmodifier //this class is acessble throughout the class
{
	public static int a=20;// acessible throughout the class.member level acess modifier
		
	
	
		public void m1()//member level acess modifier.acessible throughout the project
		{
			System.out.println("m1 method from acessmodifier class");
		}
	public static void main(String[] args) {
		System.out.println(a);
		Acassmodifier a1=new Acassmodifier();
		a1.m1();
		
	}
	//ACESS_Modifier A1=new ACESS_Modifier();
	//A1.m1();
	
}
//20
//m1 method from acessmodifier class
//public acess modifier