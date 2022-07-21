package domain;

public class Customers
{
	//fields and attributes
	public int customerId;
	public String firstName;
	public String lastName;
	public String email;
	public String address;
	//method and behaviours
	public void show()
	{
		System.out.println(customerId + " - " + firstName + " " + lastName + " - " + email + " - " + address);
	}
}
