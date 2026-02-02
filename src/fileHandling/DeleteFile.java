package fileHandling;

import java.io.File;
import java.io.IOException;

public class DeleteFile {

	public static void main(String[] args) throws IOException {
		
		File file=new File("myFile2.txt");
		
		if(file.delete())
		{
			System.out.println("File "+file.getName()+" is deleted successfully ...");
		}
		else
		{
			System.out.println("File "+file.getName()+" doesnt exist...!");
		}
		
	}

}
