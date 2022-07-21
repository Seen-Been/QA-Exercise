package map_org;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap
{

	public static void main(String[] args)
	{
		Map<Integer, String> autoMap = new HashMap<Integer, String>();
		autoMap.put(101, "Hatchback Car");
		autoMap.put(102, "Truck");
		autoMap.put(103, "Bike");
		autoMap.put(104, "Scooter");
		autoMap.put(105, "Bus");
		//autoMap.remove(101);
		
		System.out.println(autoMap);
		
		for (Entry<Integer, String> upasana:autoMap.entrySet())
		{
			System.out.println(upasana.getKey() + "---" + upasana.getValue());
		}
		
		Set<Integer> keySet = new HashSet<Integer>();
		Set<String> valueSet = new HashSet<String>();
		
		for (Entry d:autoMap.entrySet())
		{
			keySet.add((Integer)d.getKey());
			valueSet.add((String)d.getValue());
			
			System.out.println(keySet);
			System.out.println(valueSet);
		}
		

	}

}
