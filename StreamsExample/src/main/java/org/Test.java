package org;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args)
	{
		Product p1 = new Product(001, "TV", 1500, 1, "Samsung", 0);
		Product p2 = new Product(002, "Headphones", 100, 1, "Philips", 0);
		Product p3 = new Product(003, "Refrigerator", 1000, 1, "SMEG", 0);
		Product p4 = new Product(004, "Toy car", 20, 1, "Hotwheels", 0);
		Product p5 = new Product(005, "Phone", 600, 1, "Apple", 0);
		Product p6 = new Product(006, "iPod", 100, 1, "Apple", 5);
		Product p7 = new Product(007, "Speakers", 400, 1, "Samsung", 0);
		
		ArrayList<Product> prodList = new ArrayList<Product>();
		prodList.add(p1);
		prodList.add(p2);
		prodList.add(p3);
		prodList.add(p4);
		prodList.add(p5);
		prodList.add(p6);
		prodList.add(p7);
		
		//does the same as below but with streams/lambda instead of for's and nested if's
		List<String> prodFD = prodList.stream() //stream source
				.filter(p->p.deliveryCharges>0) //intermediate method, filter
				.map(p->p.name)					//intermediate method, map
				.collect(Collectors.toList());	//terminal method, collector
		System.out.println(prodFD);

		//same as above but returns in set
		Set<String> prodFD2 = prodList.stream() //stream source
				.filter(p->p.deliveryCharges>0) //intermediate method, filter
				.map(p->p.name)					//intermediate method, map
				.collect(Collectors.toSet());	//terminal method, collector
		System.out.println(prodFD2);
		
		Map<Integer, String> prodMap = prodList.stream()
				.collect(Collectors.toMap(p->p.prodId, p->p.name));
		
		for (Product prod:prodList)
		{
				if (prod.brand == "Apple") //had no idea you could do this, don't get bogged down in ".contains" and stuff
				{
					if (prod.deliveryCharges > 0)
					{
						System.out.println(prod);
					}
				}
		}
		
	}

}
