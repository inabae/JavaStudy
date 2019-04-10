package ch06;

public class Exam6_3 {
	public static void main(String[] args) {
		int n = 100;
		int total = sum(n);
		System.out.println("1~" + n + "까지의 합: " + total);
	}
	
	public static int sum(int Maxnum)
	{
		int add = 0;
		for (int i = 1; i <= Maxnum; i++) {
			add += i;
		}
		return add;
	}

}
