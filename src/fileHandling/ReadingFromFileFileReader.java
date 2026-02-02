package fileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFileFileReader {
	public static void main(String[] args) throws IOException {

		//File Reader Reads the file character by character
		//Reads data as 16-bit Unicode characters
		//working specifically with text files
		
		FileReader file=new FileReader("myFile.txt");
		int chara;
		
		while((chara =file.read()) != -1)
		{
			System.out.print((char)chara);
		}
		
		file.close();
	}

}
