package workshop;

public class CardCheck
{
	public void CheckValidity (String cardNo) throws CreditCardValidityException
	{
		int length = cardNo.length();
		
		if (length != 16)
		{
			throw new CreditCardValidityException("Invalid card number");
		}
		else
		{
			System.out.println("Credit card accepted!");
		}
	}
}
