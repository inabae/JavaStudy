package ch12;

import java.util.Scanner;

public class Exam12_1 {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		while (true) {
			System.out.print("ID�� �Է����ּ���. => ");
			Scanner s = new Scanner(System.in);
			String id = s.nextLine(); // string�� �ޱ�

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
				System.out.print("�Է��Ͻ� ID�� " + id + "�Դϴ�");
				System.out.println();
				System.out.println("���� ���ԵǾ����ϴ�.");
				break;
			} else
				continue;
		}
	}

}
