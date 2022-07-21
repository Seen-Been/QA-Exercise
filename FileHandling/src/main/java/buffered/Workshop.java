package buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Workshop
{

	public static void main(String[] args)
	{
		try(
				BufferedReader br = new BufferedReader(new FileReader("src/main/resources/x.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/xnew.txt"))
		)
		{
			String line;
			while((line = br.readLine()) != null)
			{
				bw.write(line + "\n");
			}
		}
		catch (IOException e)
		{
			System.out.println("IOException: " + e.getMessage());
		}
	}
}