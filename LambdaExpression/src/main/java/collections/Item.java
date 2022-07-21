package collections;

public class Item
{
	String name;
	int price;
	String brand;
	int qty;
	public Item(String name, int price, String brand, int qty)
	{
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", brand=" + brand + ", qty=" + qty + "]";
	}
}
