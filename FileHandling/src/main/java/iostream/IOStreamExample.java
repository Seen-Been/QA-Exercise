package iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamExample
{
	public void copy(String inFile, String outFile) throws IOException
	{
        try (
        		FileInputStream fileInputStream = new FileInputStream("src/main/resources/cat.png");
        		FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/kitty.png");
        	)
        {
            int numberOfBytesRead;
            byte[] bytesArray = new byte[128];
            while ((numberOfBytesRead = fileInputStream.read(bytesArray)) != -1)
            {
                fileOutputStream.write(bytesArray, 0, numberOfBytesRead);
            }
        }
    }
}
