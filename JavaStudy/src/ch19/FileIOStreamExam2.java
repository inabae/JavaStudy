package ch19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamExam2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("c:/dev/big.bin");
			fos = new FileOutputStream("c:/dev/big2.bin");

			int data = 0;
			byte[] buffer = new byte[1024]; // 장바구니 생성
			while (true) {
				data = fis.read();
				if (data == -1)
					break; // data에 더이상 읽을 것이 없을 경우 -1이 나오기 때문에 -1이 나올때까지 돌리면 모든 내용을 다 볼 수 있음.
//				fos.write(data); // fis에서 읽은 data를 test2.txt를 만든 곳에 쓰는 명령해서 생성함.
				fos.write(buffer); // buffer라는 배열을 만들어 한번에 데이터를 1024크기의 장바구니를 이용해 더 효율적으로 데이터를 복사(넘겨줌)를 하게 됨.
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
