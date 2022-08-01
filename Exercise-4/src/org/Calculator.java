package org;
import java.util.Scanner;

		// create a method to clean up duplicates
		// maybe implement constructors
		// add more complex operations
		// change user interaction to be more friendly and intuitive




public class Calculator
{
	double x;
	double y;
	
	public double add()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter first number");
		x = scn.nextDouble();
		System.out.println("Please enter second number");
		y = scn.nextDouble();
		return x+y;
	}
	public double sub()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter first number");
		x = scn.nextDouble();
		System.out.println("Please enter second number");
		y = scn.nextDouble();
		return x-y;
	}
	public double div()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter first number");
		x = scn.nextDouble();
		System.out.println("Please enter second number");
		y = scn.nextDouble();
		return x/y;
	}
	public double mult()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter first number");
		x = scn.nextDouble();
		System.out.println("Please enter second number");
		y = scn.nextDouble();
		return x*y;
	}
	public double perc()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter first number");
		x = scn.nextDouble();
		System.out.println("Please enter second number");
		y = scn.nextDouble();
		return (x/y) * 100;
	}
}
