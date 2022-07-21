package org;

public class Test

{
	public static void main(String[] args)
	{
		// in lambda exp., left side takes the argument and right side takes body (left -> right)
		//Interfaces tackle the problem that Java cannot have multiple inheritance. A child class can only usually have one parent.
		Employee emp = new Employee();
		emp.doSomething();
		emp.work();
		emp.workHours();
		
		//Doable do1 = new Doable(); -- Cannot create an object of an interface
		Doable do1 = new Employee(); // Polymorphic implementation
		do1.doSomething();
		
		Doable do2 = () -> {	System.out.println("Employees do something");	}; //lambda expression
		
		/*Doable do2 = new Doable() { //creating an anonymous class
			public void doSomething()
			{
				System.out.println("Employees do something");
			}
		};*/
		do2.doSomething();
		
		Transferrable tr = new Transferrable()
		{
		public void transfer()
			{
			System.out.println("Employees do travel to work");
			}
		};
		tr.transfer();
		
		Workable wk = new Workable()
			{
				public void work()
					{
					System.out.println("Employees work on different projects based on skillset");
					}
				public void workHours()
				{
				}
			};
			wk.work();
			wk.workHours();
	}
}
