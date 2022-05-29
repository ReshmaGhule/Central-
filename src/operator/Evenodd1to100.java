package operator;

import java.util.Scanner;

public class Evenodd1to100
{
  public static void main(String[] args) 
{
	//int i;
	Scanner scan=new Scanner(System.in);
	
	System.out.println("enter number");
	
    int number=scan.nextInt();
   
	
	//for(i=1;i<=100;i++) 
	//{
		if(number%2==0) 
		{
			System.out.println( "number is even");
		}
	
	else
	    {
		System.out.println( "number is odd");
	    }
  // }
}
}


