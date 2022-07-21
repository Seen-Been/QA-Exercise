package org;

public class Test
{
	public static void main(String[] args)
	{
		Student stud = new Student();
		stud.id = 101;
		stud.name = "Imran";
		
		Course c1 = new Course();
		c1.title = "Physics";
		c1.duration = 3;
		stud.course=c1;
		
		Address add = new Address();
		add.city= "London";
		add.postcode = 123456;
		stud.address=add;
	}
}
