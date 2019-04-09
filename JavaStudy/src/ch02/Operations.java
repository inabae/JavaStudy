package ch02;

import java.util.Scanner;

public class Operations {
	public static void main(String[] args) {
		// 0
		boolean result = 1 + 2 / 2 >= 1 + 1 * 2;
		System.out.println("결과: " + result);
		// 1
		float div = (float) (5.0 / 2.0);
		System.out.println(div);
		// 2
		int a = 23;
		int b = 5;
		System.out.println("몫: " + a / b);
		System.out.println("나머지" + a % b);
		// 3
		int num = 456;
		num /= 100;
		num *= 100;
		System.out.println(num);
		// 4
		int numb = 333;
		numb = numb - (numb % 10) + 1;
		System.out.println(numb);
		// 5
		Scanner s = new Scanner(System.in);
		System.out.println("2자리수 정수 입력(10~99)>>");
		int n = s.nextInt();
		int ten = n / 10;
		int one = n % 10;
		boolean isMath = ten == one ? true : false;
		System.out.println(isMath);
		s.close();
		// 6
		int numbe = 12345;
		int o = numbe % 10; // 5
		numbe /= 10; // 1234
		int t = numbe % 10; // 4
		numbe /= 10;
		int h = numbe % 10; // 3
		numbe /= 10;
		int th = numbe % 10; // 2
		numbe /= 10;
		int p = numbe % 10; // 1
		int sum = o + t + h + th + p;
		System.out.println("각 자리의 숫자 합: " + sum);
		// 7
		int number = -3;
		System.out.println(number >= 0 ? '양' : '음');
		// 8
		char ch = 'T';
		char LowerCase = ('A' < ch && ch < 'Z') ? (char)(ch + 32) : ch;
		System.out.println("ch : " + ch);
		System.out.println("ch to LowerCase : " + LowerCase);
	}

}
