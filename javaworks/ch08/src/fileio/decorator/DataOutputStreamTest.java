package fileio.decorator;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamTest {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("file1.txt");
			DataOutputStream dos = new DataOutputStream(fos)){
			dos.writeInt(65);  //정수
			dos.writeFloat(2.54F); //실수
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("수행 완료");
	}

}
