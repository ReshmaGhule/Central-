package constructor;

public class Secondprog
{
	public Secondprog()
	{
		System.out.println("I am cnstructor");
		
		// TODO Auto-generated constructor stub
	}
	public Secondprog(int a)
	{
	System.out.println("I amne argument constructor");	
		
	}
	public Secondprog(int a,int b)
	{
		System.out.println("I am two argument constructor");
		
	}
	public static void main(String[] args) 
	{
		Secondprog obj1=new Secondprog();
		Secondprog obj2=new Secondprog(12);
		Secondprog obj3=new Secondprog(15,16);
	}

}
