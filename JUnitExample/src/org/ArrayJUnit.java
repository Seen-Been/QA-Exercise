package org;

public class ArrayJUnit
{
	/* public static void main(String[] args)
		{
	
		int[] myArray = {20, 1, 3000, 865, 3050, 5500};
		
		for (int i = 1; i < 5; i++)
		{
			int max = myArray[0];
			if (max <= myArray[i])
				{
					return;
				}
			else if (max >= myArray[i])
				{
					max = myArray[i];
					return;
				}
			else
				System.out.println(max);
				break;
		}
		
	} */
	public static int findMax(int nums[])
	{
		int max = nums[0];
		for (int i = 1; i < nums.length; i++)
		{
			if (max<nums[i])
			{
				max = nums[i];
			}
		}
		return max;
	}
	
}
