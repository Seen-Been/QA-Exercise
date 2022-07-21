package org;

public class RemainderCalculator
{
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
