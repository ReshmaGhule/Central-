package acess_modifier;

public class ACESSMOD_child extends ACESS_Modifier
{
	public static void main(String[] args) {
		
		System.out.println(ACESS_Modifier.class);
		ACESS_Modifier C1=new ACESSMOD_child();
	//ACCESSMOD_child.m1();//m1 is private method  thats why not acessible in other class
		C1.m2();
	}

}
