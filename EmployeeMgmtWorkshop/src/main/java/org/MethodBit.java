package org;

public class MethodBit
{
	public float bonusSalary(float basicSalary)
	{
		
		return basicSalary / 10;
	}
	
	public float finalSalary(float basicSalary)
	{
		float bonus = basicSalary / 10;
		
		return basicSalary + bonus;
		
	}
	
	public String greeting(String firstName, String lastName)
	{
		return "Hello " + firstName + lastName;
		
	}
	
	public String validPhone(long lphone)
	{
		String sPhone = Long.toString(lphone);
		
		if (sPhone.length() == 10)
			return "phone number is correct length";
		else
			return "incorrect length of phone number";
	}
	
	public String checkEmail(String email)
	{
		if (email.contains("@"))
			return "email address accepted";
		else
			return "email address must contain @";
		
	}
	
}
