package org;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogException
{

	public void divByZero()
	{
		System.out.println(10/0);
		
	}

	public void arrayBound()
	{
		int[] x = new int [5];
		System.out.println(x[6]);
		
	}
	
	public static Logger LOGGER = LogManager.getLogger();
	
	public void logMessage(String msg)
	{
		LOGGER.info(msg);
	}
	

}
