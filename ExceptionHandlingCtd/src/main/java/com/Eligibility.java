package com;

public class Eligibility
{
	public void checkEligibility(int age) throws ExceptionCreatorException
	{
		if (age<18)
		{
			throw new ExceptionCreatorException();
		}
		else
			System.out.println("Please feel free to vote in the booth");
	}
}
