package ch19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIOStreamExam1 {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("c:/dev/test.txt");
			int data = fis.read();
			System.out.println((char)data);
			data = fis.read();
			System.out.println((char)data);
			data = fis.read();
			System.out.println((char)data);
			data = fis.read();
			System.out.println((char)data);
			data = fis.read();
			System.out.println((char)data);
			data = fis.read();
			System.out.println((char)data);
			data = fis.read();
			System.out.println((char)data);
			data = fis.read();
			System.out.println((char)data);
			data = fis.read();
			System.out.println((char)data);
			data = fis.read();
			System.out.println((char)data);
			data = fis.read();
			System.out.println((char)data);
			data = fis.read();
			System.out.println(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
