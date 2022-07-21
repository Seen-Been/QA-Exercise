package test;
import java.util.Scanner;

public class Test
{
	
	public static void main(String[] args)
	{
		
		/*Calculator cal = new Calculator();
		cal.radius = 13.2;
		cal.areaOfCircle();
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number to check if it is even or odd:");
		int x = scanner.nextInt();

		if (x % 2 == 0)
		{
			System.out.println("The number entered is even.");
			scanner.close();
		}
		else
		{
			System.out.println("The number you entered is odd.");
		}
		
		
		
	}
}
