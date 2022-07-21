package domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import org.junit.Test;

public class Test2
{
	private ArrayList<String> list;
	@Test // - Where connection is actually tried
	public void m6 ()
	{
		list.add("Sean");
		assertFalse(list.isEmpty()); // checks true or false
		assertEquals(1, list.size());
	}
}
