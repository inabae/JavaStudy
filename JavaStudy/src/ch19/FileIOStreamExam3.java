package ch19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamExam3 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("c:/dev/big.bin");
			fos = new FileOutputStream("c:/dev/big2.bin");

			//장바구니(byte[]를 쓰기 싫으면 이렇게도 가능하지만 속도는 좀 더 느리다.)
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int data = 0;
			
			while (true) {
				data = bis.read();
				if (data == -1)break;
				bos.write(data); // buffer라는 배열을 만들어 한번에 데이터를 1024크기의 장바구니를 이용해 더 효율적으로 데이터를 복사(넘겨줌)를 하게 됨.
				System.out.println((char) data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 안전하게 읽고 쓴 파일을 닫아줌.
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 안전하게 읽고 쓴 파일을 닫아줌.
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
