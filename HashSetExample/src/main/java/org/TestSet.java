package org;

import java.util.HashSet;
import java.util.Set;

public class TestSet
{
	public static void main(String[] args)
	{
		Set<String> fruits = new HashSet<String>(); //Hash set and tree set.
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Apple");
		System.out.println(fruits); 		//No duplicates. Order is changed to random.
											//Tree set changes to alphabetical order.
		System.out.println(fruits.size());
									
	}
}
