package org;

public class Employee
{
	String firstName;
	String lastName;
	int age;
	String address;
	long phone;
	String email;
	float salary;
	float bonus;
	
	public Employee(String firstName, String lastName, int age, String address,
			long phone, String email, float salary)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.salary = salary;
	}
	
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
		return "Hello " + firstName + " " + lastName;
		
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
