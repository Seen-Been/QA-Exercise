package org;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {

	public static void main(String[] args)
	{
		try
		{
			FileReader fr = new FileReader("x.txt"); //read file
			int data = fr.read(); //perform read on file, Reads ASCII value of the characters
			while (data != -1) //while it's not the end of the file
			{
				System.out.print((char)data); //change ASCII value of characters to char. NOT "println".
				data = fr.read();
				fr.close();
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
