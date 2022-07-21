package net;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAsserts
{
	@Test
	public void testAssert()
	{
		String str1 = "Sean";
		String str2 = "Sean";
		String str3 = null;
		
		int x = 10;
		int y = 20;
		
		int[] xarr = {1,2,3};
		int[] yarr = {1,2,3};
		
		assertEquals(str1,str2);
		assertSame(str1,str2);
		assertNotSame(str1,str2);
		assertNull(str3);
		assertNotNull(str3);
		assertTrue(x > y);
		assertArrayEquals(xarr, yarr);
		
	}
}
