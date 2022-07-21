package org;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {

	public static void main(String[] args)
	{
		try
		{
			FileWriter fw = new FileWriter("x.txt");
			String content = "This is a java-created text file.";
			fw.write(content);
			fw.flush();
			System.out.println("File written successfully");
			fw.close();
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
