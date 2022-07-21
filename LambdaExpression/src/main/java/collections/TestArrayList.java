package collections;

import java.util.ArrayList;

public class TestArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Comparable> myList = new ArrayList();
		myList.add("Sean");
		myList.add(1234);
		myList.add(true);
		myList.add(30.25);
		System.out.println(myList);
		
		ArrayList<Integer> myNum = new ArrayList();
		myNum.add(1000);
		myNum.add(36256);
		myNum.add(5);
		System.out.println(myNum);
		
		ArrayList<Item> itemList = new ArrayList();
		Item one = new Item("Tv", 4500, "Samsung", 1);
		Item two = new Item("Webcam", 2000, "Logitech", 1);
		Item three = new Item("Sausage", 350, "Richmond", 1);
		
	}
}
