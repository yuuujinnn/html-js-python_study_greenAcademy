package fileio.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("data2.txt");
		
		int data;
		/*while(true) {
			data = fr.read();  //코드값으로 저장
			if(data == -1)  //읽을 데이터가 없으면
				break;      //빠져 나옴
			System.out.print((char)data);  //문자로 출력
		}*/
		while((data = fr.read()) != -1) {
			System.out.print((char)data);
		}
		
		fr.close();
	}
}
