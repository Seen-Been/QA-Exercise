package test;

import domain.Customers;

public class Test {

	public static void main(String[] args)
	{
		Customers c1 = new Customers(); //creating customer object
		c1.customerId = 1001;
		c1.firstName = "Sean";
		c1.lastName = "Heathcote";
		c1.address = "United Kingdom";
		c1.email = "sheathcote-cv22@protonmail.com";
		c1.show();
		Customers c2 = new Customers(); //creating customer object
		c2.customerId = 1002;
		c2.firstName = "Connor";
		c2.lastName = "McGregor";
		c2.address = "Republic of Ireland";
		c2.email = "cooldude1988@live.com";
		c2.show();
	}
}
