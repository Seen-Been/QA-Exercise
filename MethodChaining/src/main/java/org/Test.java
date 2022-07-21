package org;

public class Test
{
	public static void main(String[] args)
	{
		/* MethodExample smp = new MethodExample();
		smp.setName("Sean");
		smp.showName();
		smp.greeting(); */
						//intermediate method \/	   \/ terminal method
		new MethodExample().setName("Sean").showName().greeting(); //method chaining
	}
}
