package org.qa;

public class CalculatorJUnit
{
	//unit 1
	public static int findBig(int x, int y)
	{
		if (x > y)
			return x;
		else
			return y;
	}
	//unit 2
	public static int findBiggest(int x, int y, int z)
	{
		if (x > y && x > z)
			return x;
		else if (y > x && y > z)
			return y;
		else
			return z;
	}
	
	public static boolean cardCheck(String cardNo)
	{
		if (cardNo.length() == 16)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	//accept something for the user card number. if it is not 16 digit , the test must fail.
}
