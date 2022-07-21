package com;

public class Test
{
	public static void main(String[] args)
	{
		/*Addition ad1 = (x,y) -> {	System.out.println("This adds two numbers");	}; //void method
		ad1.add(20, 5);
		
		Addition ad2 = (x,y) -> {	int sum=x+y; System.out.println("The result is " + sum);};
		ad2.add(100,200); */
		
		Addition ad3 = (x,y) -> {return x+y;}; //int return method
		int result = ad3.add(40, 50);
		System.out.println(result);
		System.out.println(ad3.add(40, 50));
	}
}
