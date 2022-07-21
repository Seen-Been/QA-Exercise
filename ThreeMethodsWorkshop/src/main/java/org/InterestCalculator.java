package org;

public class InterestCalculator
{
	public static double InterestTotal(float amount, float rate, int time)
	{
		return ((amount * rate * time) / 100) + amount;
	}
	public static double InterestMonthly(float amount, float rate, int time)
	{
		return ((amount * rate * time) / 100);
	}
}

