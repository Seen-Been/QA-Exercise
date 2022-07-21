package test;

public class ContinueBreak
{

	public static void main(String[] args)
	{
		for (int i = 0; i < 10; i++)
		{
			if (i == 2)
			{
				continue; //skips i ==2
			}
			if (i == 7)
			{
				break; //breaks whole loop
			}
			System.out.println(i);
		}
	}
}
// 0, 1, 3, 4, 5, 6