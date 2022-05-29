package constructor;

public class Multipleconst 
{
public Multipleconst()
{
	System.out.println(" I am constructor");
}
public Multipleconst(int a)
{
	System.out.println(" I am one argument constructor");
}
public Multipleconst( int a,int b)
{
	System.out.println(" I am two argument constructor ");
}
public static void main(String[] args) 
{
Multipleconst obj01=new Multipleconst();
Multipleconst obj02=new Multipleconst(10);
Multipleconst obj03=new Multipleconst(25, 14);
}
}
