package com.example.exception;

import javax.persistence.EntityNotFoundException;

public class ProductNotFoundException extends EntityNotFoundException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ProductNotFoundException()
	{
		
	}
	public ProductNotFoundException(String msg)
	{
		super(msg);
	}
}
