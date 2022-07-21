package com;

public class ExceptionCreatorException extends Exception
{
	public ExceptionCreatorException() //shows no message
	{}
	
	public ExceptionCreatorException(String msg)
	{
		super(msg);
	}
}
