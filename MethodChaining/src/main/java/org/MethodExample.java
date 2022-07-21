package org;

public class MethodExample
{
	String name;

	public MethodExample setName(String name)
	{
		this.name = name;
		return this;
	}
	public MethodExample showName()
	{
		System.out.println(name);
		return this;
	}
	public void greeting()
	{
		System.out.println("Hello " + name);
	}
	
}