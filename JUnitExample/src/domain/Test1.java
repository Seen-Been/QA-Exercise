package domain;

import static org.junit.Assert.assertEquals;

import org.CalculatorJUnit;
import org.junit.Test;

public class Test1
{
	@Test
	public void checkFindBig()
	{
		assertEquals(15,CalculatorJUnit.findBig(10, 20));
	}
}
