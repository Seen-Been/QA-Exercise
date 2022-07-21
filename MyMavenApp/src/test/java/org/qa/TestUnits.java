package org.qa;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestUnits
{
	public void checkFindBig()
	{
		assertEquals(20,CalculatorJUnit.findBig(10,20));
	}
	@Test
	public void checkFindBiggest() // Good practise: write separate test for separate methods
	{
		assertEquals(40,CalculatorJUnit.findBiggest(10,40,30));
	}
	
	@Test
	public void checkFindMax()
	{
		int[] x = {100, 200, 300, 400, 3, 400, 6, 20};
		assertEquals(400,ArrayJUnit.findMax(x));
	}
}
