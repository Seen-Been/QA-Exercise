package org;

public class Person
{
	String name;
	int age;
	String address;

	//signature of constructor should match on Test class.
	public Person(String n, int age, String add)		//use name of class for constructor.
	{
		this.name = n;
		
		if (age <= 0 || age > 120)
		{
			System.out.println("invalid age.");
		}
		else
		{
			this.age = age;
		}
		this.address = add;
		System.out.println("Person constructor called.");
	}

	public Person () 	//no argument constructor. default. second constructor makes "constructor overloaded".
	{				
						//must differ from each other in number of arguments, order of arguments or types of arguments.
	}
	public Person (String n, int a)
	{				
		name = n;
		age = a;
	}
	
	
	public void talk() //void does not return a value or statement
	{
		System.out.println("people do talk");
		//no return necessary
	}
	public void walk()
	{
	
	}
}
