package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy2 {
	public static void main(String[] args) {
		//이미지 파일을 읽고 쓰기(복사)
		String originFile = "c:/file/bg0.jpg"; //원본 파일
		String copyFile = "c:/file/bg1.jpg"; //원본 파일
		long start = 0, end = 0;
		
		
		try(FileOutputStream fos = new FileOutputStream(originFile);
			FileInputStream fis = new FileInputStream(copyFile)) {
			start = System.currentTimeMillis();
			
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i); //이미지 쓰기
			}
			
			end = System.currentTimeMillis();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println("파일 복사 소요시간: " + (end-start) + "ms");
		System.out.printf("파일 복사 소요시간: %dms\n", (end-start));
	} //main 끝
}

