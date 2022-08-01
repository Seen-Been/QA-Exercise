package org;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//use javatpoint.com

public class Test
{
	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
		boolean contLoop = true;
		
		while (contLoop == true)
		{
			Scanner scn = new Scanner(System.in);
			System.out.println("Please enter the number next to your requested operation:");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Percentage");
			int input = scn.nextInt();
			
			switch(input)
			{
			case 1:
				System.out.println("operation selected: ADDITION");
				System.out.println("The result is " + cal.add());
				break;
			case 2:
				System.out.println("operation selected: SUBTRACTION");
				System.out.println("The result is " + cal.sub());
				break;
			case 3:
				System.out.println("operation selected: MULTIPLICATION");
				System.out.println("The result is " + cal.mult());
				break;
			case 4:
				System.out.println("operation selected: DIVISION");
				System.out.println("The result is " + cal.div());
				break;
			case 5:
				System.out.println("operation selected: PERCENTAGE");
				System.out.println("The result is " + cal.perc());
				break;
			default:
					System.out.println("Option chosen is not a valid input.");
			}
			
			try {
				TimeUnit.SECONDS.sleep(1); // 1 second break between dialogue to break up the text
			} catch (InterruptedException ie) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println("Would you like to retry?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			int retry = scn.nextInt();
			
			if (retry == 1)
			{
				continue;
			}
			else
			{
				System.out.println("Exiting...");
				break;
			}
		}
	}
}
