package org;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		boolean loopBreak = false;

		while (loopBreak == false) //Loop for operation selection and retry
		{
			Scanner scn = new Scanner(System.in);
			System.out.println("Please enter your name:");
			String name = scn.next();
			
			System.out.println("Welcome " + name + ", please select an operation:");
			System.out.println("1. Simple Interest Calculator");
			System.out.println("2. Is my number a prime number?");
			System.out.println("3. Does my number divide by 5?");
			int input = scn.nextInt();
			
			switch (input)
			{
			case 1: //SIMPLE INTEREST CALCULATOR
				System.out.println("You have chosen the simple interest calculator");
				System.out.println("Please enter the amount borrowed(£):");
				float amount = scn.nextFloat();
				System.out.println("Please enter the percentage interest(%):");
				float rate = scn.nextInt();
				System.out.println("Please enter the time period of loan(years)");
				int years = scn.nextInt();
				System.out.println("The total repayable amount is " + ThreeMethods.InterestTotal(amount, rate, years));
				System.out.println("The monthly payments will be " + ThreeMethods.InterestMonthly(amount, rate, years));
				break;
			case 2: //PRIME NUMBER ASSESSOR
				System.out.println("You have chosen the prime number assessor");
				System.out.println("Please enter a number to check it's prime number status:");
				int primeInput = scn.nextInt();
				System.out.println(primeInput + " is " + ThreeMethods.Prime(primeInput));
				break;
			case 3: //DIVISIBLE-BY-5-OTRON
				System.out.println("You have chosen the divisible by 5 assessor");
				System.out.println("Please enter a number to check it's divide-by-fiveness:");
				int divFive = scn.nextInt();
				System.out.println(divFive + " is " + ThreeMethods.DivFive(divFive));
				break;
			default: //INVALID INPUT MESSAGE
				System.out.println("Option chosen is not a valid input.");
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
				scn.close();
				loopBreak = true;
				break;
			}
		}

	}
}
