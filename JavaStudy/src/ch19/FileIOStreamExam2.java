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
			byte[] buffer = new byte[1024]; // ��ٱ��� ����
			while (true) {
				data = fis.read();
				if (data == -1)
					break; // data�� ���̻� ���� ���� ���� ��� -1�� ������ ������ -1�� ���ö����� ������ ��� ������ �� �� �� ����.
//				fos.write(data); // fis���� ���� data�� test2.txt�� ���� ���� ���� ����ؼ� ������.
				fos.write(buffer); // buffer��� �迭�� ����� �ѹ��� �����͸� 1024ũ���� ��ٱ��ϸ� �̿��� �� ȿ�������� �����͸� ����(�Ѱ���)�� �ϰ� ��.
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
