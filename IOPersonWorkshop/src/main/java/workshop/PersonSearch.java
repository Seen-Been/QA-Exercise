package workshop;

import java.util.Scanner;

public class PersonSearch
{
	public String inName;
	
	public static String scnSearch(String inName)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter a name to search");
		inName = scn.next();
		scn.close();
		
		return inName;
		
	}
}
