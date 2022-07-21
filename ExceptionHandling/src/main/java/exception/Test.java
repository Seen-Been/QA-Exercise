package exception;

public class Test
{
	public static void main(String[] args)
	{
		try
		{
			int x = 10;
			int y = 0;
			int z = x / y;
			System.out.println(z);
			int[] m = new int [5];
			m[5] = 100;
			System.out.println(Math.sin(12345.67)); //skipped over because of the arithmetic exception
		}
		catch (ArithmeticException e) //will only check for arithmetic exceptions
		{
			System.out.println(e.getMessage());
			System.out.println("Something went wrong! Division by zero is not possible.");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Array out of bounds");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Something went wrong! One of the number sis probably wrong");
		}
		/*
		Alternatively, multiple specific exceptions can be checked:
		
		catch (ArrayIndexOutOfBoundsException | ArithemticException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Array out of bounds");
		}
		 */
		finally
		{
			System.out.println("This block will run regardless.");
		}
	}
	
	//application. class with 3 methods. first calculates simple interest. 2nd calculates if input is prime number. 3rd finds if input divisible by 5. Must be able to select which method the user wants
}
