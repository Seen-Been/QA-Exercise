package test;
import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int A = scanner.nextInt();
		scanner.close();
		
		if (A > 2000)
		{
			System.out.println("A");
			if (A > 6000)
			{
				System.out.println("C");
			}
			else
			{
				System.out.println("B");
				if (A > 4000)
				{
					System.out.println("D");
				}
				else
				{
					System.out.println("E");
				}
			}
		}
		else
		{
			System.out.println("1");
			if (A > 100)
			{
				System.out.println("3");
				if (A > 600)
				{
					System.out.println("5");
				}
				else
				{
					System.out.println("4");
					if (A > 500)
					{
						System.out.println("6");
					}
					else
					{
						System.out.println("7");
					}
				}
			}
			else
			{
				System.out.println("2");
			}
		}
	}

}
