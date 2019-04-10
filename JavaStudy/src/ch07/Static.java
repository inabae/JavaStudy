package ch07;

public class Static {
	static char color = 'R';
	static int num = 0;
	static int score = 0;

	static void staticMethod() {
		score = score + 1;
		System.out.println("static method");
		num++;
	}

	void instanceMethod() {
		System.out.println("instance method");
	}
}
