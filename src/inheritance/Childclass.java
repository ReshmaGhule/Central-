package inheritance;

public class Childclass extends Parents 
{
	static int x=50;
	 public static void main(String[] args) 
	 {
		 System.out.println(a);
		 m1();
		 System.out.println(x);
		 Childclass c1=new Childclass();
		 System.out.println(c1.b);
		 c1.m2();
		 System.out.println(p);
		 grandm1();
		 Childclass c2=new Childclass();
		 c2.m2();
	}

}
