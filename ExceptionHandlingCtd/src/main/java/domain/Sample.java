package domain;

public class Sample
{
	public void ExceptionHandling()
	{
		try
		{
			int x = 10;
			int y = 0;
			int z = x / y;
		}
		catch(Exception e)
		{
			System.out.println("Cannot divide by zero!");
		}
	}
	public void ExceptionDeclaring() throws Exception
	{
		int x = 10;
		int y = 0;
		int z = x / y;
	}
}
