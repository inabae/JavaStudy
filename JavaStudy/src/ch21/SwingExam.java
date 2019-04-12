package ch21;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingExam {
	public static void main(String[] args) {
		String[] datas = { "A", "B", "C", "D", "E", "F", "G" };
		JFrame frm = new JFrame();
		frm.setBounds(120,120,300,200);
		frm.setLayout(new GridLayout(3,3));
		
		for (int j = 0; j < datas.length; j++) {
			frm.add(new JButton(datas[j]));
		}
		
//		위의 for문과 같은 방식
//		for(String s : datas) {
//			frm.add(new JButton(s));
//		}
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
