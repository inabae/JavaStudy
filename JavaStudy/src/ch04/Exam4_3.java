package ch04;

public class Exam4_3 {
	public static void main(String[] args) {
		int year = 1997;
		
		if(year % 400 == 0)
			System.out.println("�����Դϴ�.");
		else if(year % 100 == 0)
			System.out.println("����Դϴ�.");
		else if(year % 4 == 0)
			System.out.println("�����Դϴ�.");
		else 
			System.out.println("����Դϴ�.");
	}

}
