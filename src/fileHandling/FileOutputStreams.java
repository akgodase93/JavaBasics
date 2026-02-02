package fileHandling;

import java.io.IOException;
import java.io.FileOutputStream;

public class FileOutputStreams {

	public static void main(String[] args) throws IOException {

		String str="Welcome to the worldf java file handling operatios using IO Streams";
		
		FileOutputStream fos=new FileOutputStream("myfile2.txt");
		byte[] by=str.getBytes();
		
		fos.write(by);
		fos.close();
		System.out.println("File is written...");
		
		
	}

}
