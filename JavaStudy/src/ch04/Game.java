package ch04;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("가위:0, 바위:1, 보:2 입니다. 입력해주세요.");
		
		int player = s.nextInt(); //가위
		int com = (int)(Math.random() * 3); //바위
		
		if(player == com){
			System.out.println(com);
			System.out.println("비김");
		}
		else{
			if((player + 1) % 3 == com){
				System.out.println(com);
				System.out.println("짐");
			}
			else{
				System.out.println(com);
				System.out.println("이김");
			}
		}
		s.close();
	}

}
