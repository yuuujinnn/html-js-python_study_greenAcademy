package fileio.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteSample {

	public static void main(String[] args) throws IOException {
		// 바이너리 파일 생성(쓰기)
		OutputStream os = new FileOutputStream("c:/file/test1.db");
	
		os.write(10);
		os.write(20);
		os.write(30);
		
		os.close();
	}
}
