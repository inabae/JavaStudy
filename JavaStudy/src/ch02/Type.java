package ch02;

public class Type {
	public static void main(String[] args) {
		
		// 다른 타입형끼리의 연산시 더 큰 타입의 형으로 자동 연산됨을 확인
		int a = 1000000;
		int b = 2000000;
		
		System.out.println(a*b);
		
		long c = a * (long)b;
		System.out.println(c);
	}

}
