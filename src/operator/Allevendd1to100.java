package operator;

public class Allevendd1to100 
{
	public static void main(String[] args)
{
		
	
	int n=100;
	System.out.println("even numbers from 1to"+n+" are:");
	
	for( int i=1;i<=n;i++)
	{
    	if(i%2==0)
    	
	System.out.print(i+"");
	}
 
	System.out.println("odd numbers from 1 to"+n+" are:");
	
	for(int i=1;i<=n;i++)
	{
		if(i%2!=0)
			System.out.print(i+"");
	}
	}
}