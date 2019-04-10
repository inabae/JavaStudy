package ch12;

import java.util.Scanner;

public class Exam12_1 {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		while (true) {
			System.out.print("ID를 입력해주세요. => ");
			Scanner s = new Scanner(System.in);
			String id = s.nextLine(); // string값 받기

			boolean isUpper = false;
			boolean isLower = false;

			for (int i = 0; i < id.length(); i++) {
				char idCheck = id.charAt(i);
				if (idCheck > ASCII_A && idCheck < ASCII_Z) {
					isUpper = true;
				} else if (idCheck > ASCII_a && idCheck < ASCII_z) {
					isLower = true;
				}
			}
			if (isUpper == true && isLower == true) {
				System.out.print("입력하신 ID는 " + id + "입니다");
				System.out.println();
				System.out.println("정상 가입되었습니다.");
				break;
			} else
				continue;
		}
	}

}
