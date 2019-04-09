package ch02;

import java.util.Scanner;


public class Operation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int in = s.nextInt();
		System.out.println(in);
		
		char result = in >= 0 ? '¾ç' : 'À½';
		System.out.println(result);
		s.close();
	}
}
