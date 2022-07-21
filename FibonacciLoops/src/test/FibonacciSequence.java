package test;

public class FibonacciSequence
{
	public static void main(String[] args)
	{
		int number1 = 0;
		int number2 = 1;
		int number3;
		
		for (int i = 2; i < 20; i++)
		{
			number3 = number1 + number2;
			System.out.print(" " + number3);
			number1 = number2;
			number2 = number3;
			i++;
		}
		
		
		
		
		
	}
}
