package org.qa;

public class LeapYear
{
	public static boolean LeapYearCheck(int yearInput)
	{
		if (yearInput % 4 == 0)
		{
			if (yearInput % 100 == 0)
			{
				if (yearInput % 400 == 0)
				{
					System.out.println("This year is a leap year!");
					return true;
				}
				else
				{
					System.out.println("This year is a common year.");
					return false;
				}
			}
			else
			{
				System.out.println("This year is a leap year!");
				return true;
			}
		}
		else
		{
		System.out.println("This year is a common year.");
		return false;
		}
	}
}
