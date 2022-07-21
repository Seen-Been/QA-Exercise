package furniture;

import java.util.ArrayList;
import java.util.List;

public class Test
{
	public static void main(String[] args)
	{
		List<DiningTable> diningTableList = new ArrayList<DiningTable>();
		DiningTable dt = new DiningTable();
		diningTableList.add(dt);
		
		List<DiningChair> diningChairList = new ArrayList<DiningChair>();
		DiningChair dc1 = new DiningChair(); // To add objects manually
		DiningChair dc2 = new DiningChair();
		DiningChair dc3 = new DiningChair();
		DiningChair dc4 = new DiningChair();
		DiningChair dc5 = new DiningChair();
		DiningChair dc6 = new DiningChair();
		/*diningChairList.add(dc1);
		diningChairList.add(dc2);
		diningChairList.add(dc3);
		diningChairList.add(dc4);
		diningChairList.add(dc5);
		diningChairList.add(dc6); */
		FurnitureTest obj = new FurnitureTest();
		obj.makeFurniture(diningChairList); //makes it for all
		
	}

}
