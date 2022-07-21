package buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteExample
{

	public static void main(String[] args)
	{
		try
		{
			FileWriter fw = new FileWriter("x.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			//BufferedWriter bw = new BufferedWriter(new FileWriter("x.txt"));
			
			String content = "This is a java-created text file.";
			bw.write(content);
			bw.flush();
			System.out.println("File written successfully");
			bw.close();
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}