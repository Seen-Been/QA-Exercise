package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import org.CalculatorJUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestAnnotation // order written does not matter, order at runtime is based on annotations.
{
	private ArrayList<String> list;
	@BeforeClass // before all the test classes
	public static void m1() // BeforeClass and AfterClass can be static
	{
		System.out.println("@BeforeClass");
	}
	@Before //before each test - Starting the connection
	public void m2() // Before should not be static.
	{
		list = new ArrayList<String>();
		System.out.println("@Before");
	}
	@AfterClass // after all test classes
	public static void m4()
	{
		System.out.println("@AfterClass");
	}
	@Ignore // not to be tested
	public static void m5 ()
	{
		System.out.println("This is ignored");
	}
	@Test // - Where connection is actually tried
	public void m6 ()
	{
		list.add("Sean");
		assertFalse(list.isEmpty()); // checks true or false
		assertEquals(1, list.size());
	}
	
	@Test
	public void checkFindBig()
	{
		assertEquals(20,CalculatorJUnit.findBig(10, 20));
	}
	@After // after each test - should not be static.
	public void m3()
	{
		System.out.println("After");
	}
}
