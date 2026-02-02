package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WritingToFileFileWriter {
	public static void main(String[] args) throws IOException {
		
		
		//File Writer writes into the file character by character
		//working specifically with text files
		//If the target file does not exist, FileWriter will create it.
		//By default, it overwrites the contents of an existing file.
		
		FileWriter writer=new FileWriter("myFile.txt");
		writer.write("I am writing into text file as a part of file handling operaions....!");
		writer.close();
		
		
		System.out.println("Successfully written into text file.");
	}

}
