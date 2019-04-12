package ch21;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class SwingExam5 {
	public static void main(String[] args) {
		Bingo b = new Bingo();
		b.display();
	}
}

class BtnHandler implements ActionListener {
	int[][] bingo = new int[5][5];
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.LIGHT_GRAY);

		// 선택된 버튼의 좌표 확인 (setName으로 지정된 값)
		String xy = btn.getName();
		System.out.println(xy);
		/* 가로줄 완성 확인 코드 */
		char x = xy.charAt(0);
		char y = xy.charAt(1);
		// char형을 int형으로 바꿔주기
		int numx = Integer.parseInt(x + "");
		int numy = Integer.parseInt(y + "");
		
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				
			}
		}
		/* 세로줄 완성 확인 코드 */
	}
}