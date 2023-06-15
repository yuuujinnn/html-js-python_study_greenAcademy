package fileio.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest3 {

	public static void main(String[] args){
		//close()를 하지 않는 방법
		//try ~ with ~ resource문
		try(Reader fr = new FileReader("data.txt")){
			int data;
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
