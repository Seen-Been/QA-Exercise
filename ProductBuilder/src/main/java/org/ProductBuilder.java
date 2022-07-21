package org;

public class ProductBuilder
{
	private int id;
	private String name;
	private String brand;
	private int price;
	
	// Method 1 creates Product objects
	public ProductBuilder()
	{
		
	}
	
	// Creates Product object, fully instantiated when returned
	public Product buildProduct()
	{
		return new Product(id, name, brand, price);
	}
	
	//
	public ProductBuilder id(int passedId)
	{
		this.id = passedId;
		return this;
	}
	
	public ProductBuilder name(String passedName)
	{
		this.name = passedName;
		return this;
	}
	
	public ProductBuilder brand(String passedBrand)
	{
		this.brand = passedBrand;
		return this;
	}
	
	public ProductBuilder price(int passedPrice)
	{
		this.price = passedPrice;
		return this;
	}
}
