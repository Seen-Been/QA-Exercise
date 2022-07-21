package org;

public class PrimeNumberCalculator
{
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
}