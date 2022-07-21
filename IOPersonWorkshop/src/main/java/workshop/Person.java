package workshop;

public class Person
{
	public String name;
	public int age;
	public String jobTitle;
	
	public Person (String name, int age, String jobTitle)
	{
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	@Override
	public String toString()
	{
		return "Person [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
	}
	
	
	
}
