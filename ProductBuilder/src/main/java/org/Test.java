package org;

public class Test
{
	public static void main(String[] args)
	{
		Product p1 = new ProductBuilder()
				.id(101)
				.name("TV")
				.brand("Samsung")
				.buildProduct();
	}
			
}
