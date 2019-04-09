package ch04;

import java.util.Scanner;

public class Exam4_7 {
	public static void main(String[] args) {
		
		//Scanner s = new Scanner(System.in);
		//int space = s.nextInt();
		
		int leftspace = 5/2; //2
		int rightspace = 4; //2
		
		for (int  i = 1;  i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if(leftspace >= j || rightspace <= j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			if(i > (5/2)) {
				leftspace += 1;
				rightspace -= 1;
			}else {
				leftspace -= 1;
				rightspace += 1;
			}
			System.out.println();
		}
		//s.close();
	}

}
