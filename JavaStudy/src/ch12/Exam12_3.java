package ch12;

public class Exam12_3 {
	public static void main(String[] args) {
		String file = "/home/temmp/java.clss";
		String[] files = file.split("/");

		for (String s : files) {
			if (s.equals("")) {   //ù��° ������ �����ϱ� ���� ��

			} else
				System.out.println(s);
		}
	}

}
