package buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadExample
{

	public static void main(String[] args)
	{
		try
		{
			FileReader fr = new FileReader("x.txt"); //read file
			BufferedReader br = new BufferedReader(fr);
			
			//BufferedReader br = new BufferedReader(new FileReader("x.txt"));
			
			int data = br.read(); //perform read on file, Reads ASCII value of the characters
			while (data != -1) //while it's not the end of the file
			{
				System.out.print((char)data); //change ASCII value of characters to char. NOT "println".
				data = br.read();
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
