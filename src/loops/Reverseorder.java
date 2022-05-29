package loops;

import java.util.Scanner;

public class Reverseorder
{
	

	public static void main(String[] args)
	{
		int a,res=0,number;
	Scanner Scan=new Scanner(System.in);
    System.out.println("enter number");
     number=Scan.nextInt();
   
    while( number!=0) 
    {
   
        	 a=number%10;
        	 
    	    res=(res*10)+a;
    	    
    	     number=number/10;
    	
    	}
    
	System.out.println("reverse order is    " +res);
	
	
	
}
}


