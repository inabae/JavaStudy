package ch04;

public class Exam4_2 {
	public static void main(String[] args) {
		int score = 91;
		
		if(score % 3 == 0 && score % 2 == 0)
			System.out.println("ÄôÂ¦");
		else if(score % 2 == 0)
			System.out.println("Â¦");
		else if(score % 3 == 0)
			System.out.println("Äô");
		else 
			System.out.println(score);
	}

}
