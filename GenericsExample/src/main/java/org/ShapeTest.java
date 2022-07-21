package org;

import java.util.List;

public class ShapeTest
{
	public void drawShapes(List<? extends Shape> list) // Creating a list of shapes
				// Would have to create 2 methods for circle/triangle instead of drawShapes without <?
	{
		for (Shape s:list) //for shape s in list
		{
			s.draw();
		}
	}
}
