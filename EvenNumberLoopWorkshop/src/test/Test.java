package test;

public class Test
{
	public static void main(String[] args)
	{
		
		int x = -1; //actual number.
		int y = 1; //iterator.
	
		while (x < 100) //While x is less than 100.
		{
			if (x % 2 == 0 && y <= 15) //For a number to print, x needs to be even and y must be below the 15th iteration.
			{
				System.out.println(x);
				y++;
			}
		x++;
		}
	}
}

