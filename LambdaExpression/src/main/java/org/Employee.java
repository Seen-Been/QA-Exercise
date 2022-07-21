package org;

public class Employee implements Doable, Workable //a class can implement multiple interfaces.
{
	 public void doSomething()
	 {
		 System.out.println("Employees do something to make their jobs easier");
	 }
	 
		public void work()
		{
			System.out.println("Employees can work on different projects based on skillset");
		}
		public void workHours()
		{
			System.out.println("Employee hours of work");
		}
}
