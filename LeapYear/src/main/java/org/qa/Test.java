package org.qa;

import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter year to check for leap year:");
		int yearInput = scn.nextInt();
		LeapYear.LeapYearCheck(yearInput);
		scn.close();
	}
}
