package ch06;

public class Exam6_1 {
	
	public static char sum(int a, char c) {
		char trans = (char)(c + a);
//		System.out.println(trans);
		return trans;
	}
	
	public static void main(String[] args) {
//		char ch = sum(2, 'f');
//		System.out.println(ch);
		System.out.println(sum(2, 'f'));
		System.out.println(sum(2, 'm'));
		System.out.println(sum(2, 'n'));
		System.out.println(sum(2, 'c'));
	}
}