package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileCopy1 {
	public static void main(String[] args) {
		//이미지 파일을 읽고 쓰기(복사)
		String originFile = "c:/file/bg0.jpg"; //원본 파일
		String copyFile = "c:/file/bg3.jpg"; //원본 파일
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(originFile);
			fos = new FileOutputStream(copyFile);
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i); //이미지 쓰기
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("복사 완료!!");
	} //main 끝
}
