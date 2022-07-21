package furniture;

import java.util.List;

public class FurnitureTest
{
	public void makeFurniture(List<? extends FurnitureType> list) // Creating a list of shapes
				// Would have to create 2 methods for circle/triangle instead of drawShapes without <?
	{
		for (FurnitureType f:list) //for shape s in list
		{
			f.make();
		}
	}
}
