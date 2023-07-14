package file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		File file = new File("c:/filetest/newFile.txt");
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		
		//file.delete();
	}

}
