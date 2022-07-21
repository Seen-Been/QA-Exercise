package com;

public class Test
{
	public static void main(String[] args)
	{
		Eligibility obj = new Eligibility();
		try
		{
			obj.checkEligibility(12);
		}
		catch (ExceptionCreatorException e) //custom exception used
		{
			e.printStackTrace();
		}
	}
}
