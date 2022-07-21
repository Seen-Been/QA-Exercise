package org;

public class Test
{
	public static void main(String[] args)
	{
		Person p1 = new Person("Sean", 25, "England"); //instantiation using constructor
		Person p2 = new Person("Sammy", 24, "Hungary");
		//Person p3 = new Person();
		
		System.out.println(p1);
		System.out.println(p2.name + p2.age + p2.address);
		Person p4 = new Person("Sammy", 24);
		System.out.println(p4.name + p4.age + p4.address);
	}
}
