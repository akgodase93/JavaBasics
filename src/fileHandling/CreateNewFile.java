package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) throws IOException {

		String fileName="myFile.txt";
		File file=new File(fileName);
		
		if(file.createNewFile())
		{
			System.out.println("New File "+fileName+" Created");
		}
		else
		{
			System.out.println("File Already Exist!!!");
		}
	}

}
