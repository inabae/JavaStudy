package ch12;

public class Exam12_3 {
	public static void main(String[] args) {
		String file = "/home/temmp/java.clss";
		String[] files = file.split("/");

		for (String s : files) {
			if (s.equals("")) {   //첫번째 공백을 무시하기 위한 식

			} else
				System.out.println(s);
		}
	}

}
