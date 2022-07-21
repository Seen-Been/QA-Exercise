package com.qa;

import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter your card number.");
		String cardNo = scn.next();
		scn.close();
		
		if (CalculatorJUnit.cardCheck(cardNo) == true)
		{
			System.out.println("Yeah that card length is alright I guess.");
		}
		else
		{
			System.out.println("WRONG WRONG WRONG");
		}
	}
}
