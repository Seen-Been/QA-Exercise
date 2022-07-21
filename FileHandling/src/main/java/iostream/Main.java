package iostream;

import java.io.IOException;

public class Main {

	public static void main(String[] args)
	{
		IOStreamExample obj = new IOStreamExample();
		try
		{
			obj.copy("x.txt", "y.txt");
			System.out.println("Operation completed");
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
