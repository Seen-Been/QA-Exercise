package org;

public class ThreeMethods
{	
	//SIMPLE INTEREST TOTAL
	public static double InterestTotal(float amount, float rate, int time)
	{
		return ((amount * rate * time) / 100) + amount;
	}
	
	//SIMPLE INTEREST MONTHLY
	public static double InterestMonthly(float amount, float rate, int time)
	{
		return ((amount * rate * time) / 100);
	}
	
	//PRIME NUMBER CHECKER
	public static String Prime(int num)
	{
		boolean primeFlag = false;
		
		for (int i = 2; i <= num / 2; i++)
		{
			if (num % i == 0)
			{
				primeFlag = true;
				break;
			}
		}
		
		if (!primeFlag || num == 1)
		{
			return "prime";
		}
		else
		{
			return "not prime";
		}
	}
	
	//DIVISIBLE-BY-5 CHECKER
	public static String DivFive(int num)
	{
		if (num % 5 == 0)
		{
			return "Divisible by 5!";
		}
		else
		{
			return "Not divisible by 5!";
		}
	}
}
