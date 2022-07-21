package com.qa;

public class CalculatorJUnit
{
	// find biggest of 2 numbers
	public static int findBig(int x, int y)
	{
		if (x > y)
			return x;
		else
			return y;
	}
	// find biggest of 3 numbers
	public static int findBiggest(int x, int y, int z)
	{
		if (x > y && x > z)
			return x;
		else if (y > x && y > z)
			return y;
		else
			return z;
	}
	// card checker
	public static boolean cardCheck(String cardNo) 	//accept something for the user card number. if it is not 16 digit , the test must fail.
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

}
