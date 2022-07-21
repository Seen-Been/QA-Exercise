package org;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestMain
{
	public static void main(String[] args)
	{
		System.out.println("hello");
		System.out.println("how're you");
		
		Result result = JUnitCore.runClasses(TestUnits.class);
		for (Failure fail : result.getFailures()) //get failures from tests, store in fail object and print.
		{
			System.out.println(fail.toString()); //return error message stating failure point
		}
		System.out.println("Result =" + result.wasSuccessful()); //return successful print statement
	}
}
