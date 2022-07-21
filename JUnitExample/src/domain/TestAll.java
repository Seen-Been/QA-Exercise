package domain;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestAll //final thing you do
{
	public static void main(String[] args)
	{
		Result result = JUnitCore.runClasses(TestSuite.class);
		for (Failure fail:result.getFailures())
		{
			System.out.println(fail.toString());
		}
		System.out.println("Result = " + result.wasSuccessful());
	}
}
