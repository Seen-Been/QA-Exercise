package org;

public class Television extends Product
{
	int modelNo;
	String brand;

	public Television(String name, int id, float price, int model, String brand)
	{
		super(name, id, price);
		this.modelNo = model;
		this.brand = brand;
	}
}
