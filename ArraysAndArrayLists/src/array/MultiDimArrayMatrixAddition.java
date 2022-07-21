package array;
import java.util.Scanner;

public class MultiDimArrayMatrixAddition
{
	//Designed for primitive types. Not strings.
	public static void main(String[] args)
	{
		int[][] num1 = new int[3][3];
		int[][] num2 = new int[3][3];
		int[][] sum = new int[3][3];
		
		System.out.println("Enter the values for array num1");
		Scanner scn = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				num1[i][j] = scn.nextInt();
			}
		}
		
		System.out.println("Enter the values for num2");
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				num2[i][j] = scn.nextInt();
			}
		}
		
		scn.close();
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				sum[i][j] = num1[i][j] + num2[i][j];
			}
		}
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.println(sum[i][j]);
			}
		}
	}
}
