package encapsulation;

import variables.Static_var;

public class Gettersetter 
{
	private int a;

	private String name;
	public void setM1(int a) 
	{
		this.a=a;
		
	}

	public void setname(String name)//setter method for setting global variables 
{
	this.name=name;
	
}
	public int getValueA()//getter method for getting values of global variables 
	{
		return a;
		
	}
	public String getName()
	{
		return name;
		
	}

}
