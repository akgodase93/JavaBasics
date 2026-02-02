package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterReader {
	public static void main(String[] args) throws IOException{
		
		
		//stores data in a buffer before writing or reading 
		//faster and smoother instead of reading or writing one character at a time.
		
		BufferedWriter bw= new BufferedWriter(new FileWriter("myTextFile.txt"));
		bw.write("Welcome to file operations in JAVA");
		//bw.newLine();
		//bw.write("I have added new line and added some more text..");
		System.out.println("Successfully writen the file");

		bw.close();
		
		BufferedReader br=new BufferedReader(new FileReader("myTextFile.txt"));
		String line;
		System.out.println("Below is the file text: ");
		while((line=br.readLine()) !=null)
		{
			System.out.print(line);
		}
		
		br.close();
	}

}
