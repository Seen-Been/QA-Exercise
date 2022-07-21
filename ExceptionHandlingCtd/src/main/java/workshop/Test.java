package workshop;

public class Test
{
	public static void main(String[] args)
	{
		CardCheck obj = new CardCheck();
		
		try
		{
			obj.CheckValidity("1234567812345678");
		}
		catch (CreditCardValidityException e)
		{
			e.printStackTrace();
		}
	}
}
