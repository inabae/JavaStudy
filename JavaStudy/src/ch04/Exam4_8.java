package ch04;

public class Exam4_8 {
	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
				if(i/100 == 3){ // 100의 자리가 3
					System.out.println(i);
				}
				else if((i/10)%10 == 3){ // 10의 자리가 3
					System.out.println(i);
				}
				else if(i/10 == 3) { // 10의 자리가 3
					System.out.println(i);
				}
				else if(i%10 == 3) { // 1의 자리가 3
					System.out.println(i);
				}
//			if(i > 100){
//				if(i/100 == 3){ // 100의 자리가 3
//					System.out.println(i);
//				}
//			    else if((i/10)%10 == 3){ // 10의 자리가 3
//					System.out.println(i);
//				}
//				else if(i%10 == 3) { // 1의 자리가 3
//					System.out.println(i);
//				}
//			}else{
//				if(i/10 == 3) { // 10의 자리가 3
//					System.out.println(i);
//				}
//				else if(i%10 == 3) { // 1의 자리가 3
//					System.out.println(i);
//				}
//			}
		}
	}
}
