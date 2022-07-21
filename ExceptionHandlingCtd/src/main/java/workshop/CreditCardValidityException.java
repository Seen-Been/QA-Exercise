package workshop;

public class CreditCardValidityException extends Exception
{
	public CreditCardValidityException()
	{}
	
	public CreditCardValidityException(String msg)
	{
		super(msg);
	}
}
