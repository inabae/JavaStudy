package ch12;

public class Exam12_2 {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		String msg = "Cyqw amkc, cyqw em";

		for (int i = 0; i < msg.length(); i++) {
			char c = msg.charAt(i);
			if (c >= ASCII_A && c <= ASCII_Z) {
				c = (char) (c + 2);
				if (c > ASCII_Z) {
					c -= 26;
				}
			} else if (c >= ASCII_a && c <= ASCII_z) {
				c = (char) (c + 2);
				if (c > ASCII_z) {
					c -= 26;
				}
			}
			System.out.print(c);
		}
	}

}
