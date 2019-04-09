package ch04;

public class Exam4_5 {
	public static void main(String[] args) {
		boolean isContinue = true;
		int count = 0;
		int num1 = 0;
		int num2 = 0;
		
		while(isContinue)
		{
			num1 = (int)(Math.random() * 6 + 1);
			num2 = (int)(Math.random() * 6 + 1);
			count++;
			
			if(num1 + num2 == 10)
				isContinue = false;
		}
		System.out.println(num1 + ", " + num2);
		System.out.println("주사위를 던진 횟수 : " + count);
		
	}

}
