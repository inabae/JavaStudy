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

		// ���õ� ��ư�� ��ǥ Ȯ�� (setName���� ������ ��)
		String xy = btn.getName();
		System.out.println(xy);
		/* ������ �ϼ� Ȯ�� �ڵ� */
		char x = xy.charAt(0);
		char y = xy.charAt(1);
		// char���� int������ �ٲ��ֱ�
		int numx = Integer.parseInt(x + "");
		int numy = Integer.parseInt(y + "");
		
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				
			}
		}
		/* ������ �ϼ� Ȯ�� �ڵ� */
	}
}