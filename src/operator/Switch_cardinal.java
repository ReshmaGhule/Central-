package operator;

import java.util.Scanner;

public class Switch_cardinal
{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter number");
		int number=scan.nextInt();
		switch(number)
		{
		case 1:
			System.out.println("first");
		break;
		case 2:
			System.out.println("second");
			break;
		case 3:
			System.out.println("third");
			break;
		case 4:
			System.out.println("fourth");
			break;
		case 5:
			System.out.println("fifth");
			break;
		case 6:
			System.out.println("sixth");
			break;
		case 7:
			System.out.println("seventh");
			break;
		case 8:
			System.out.println("eighth");
			break;
		case 9:
			System.out.println("nineth");
			break;
		case 10:
			System.out.println("tenth");
		}
	}

}
