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

			//��ٱ���(byte[]�� ���� ������ �̷��Ե� ���������� �ӵ��� �� �� ������.)
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int data = 0;
			
			while (true) {
				data = bis.read();
				if (data == -1)break;
				bos.write(data); // buffer��� �迭�� ����� �ѹ��� �����͸� 1024ũ���� ��ٱ��ϸ� �̿��� �� ȿ�������� �����͸� ����(�Ѱ���)�� �ϰ� ��.
				System.out.println((char) data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// �����ϰ� �а� �� ������ �ݾ���.
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// �����ϰ� �а� �� ������ �ݾ���.
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
