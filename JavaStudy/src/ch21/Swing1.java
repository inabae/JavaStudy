package ch21;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing1 {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		
		j.setLayout(new FlowLayout()); // ������ �⺻������ �ϰڴ�.ex> ��ưũ��,��ġ ��..
		
		JButton b1 = new JButton("button1");
		JButton b2 = new JButton();
		b2.setText("button2");
		
		j.add(b1);
		j.add(b2);
		
		j.setSize(400,400);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư���� ���� ��� ����
		j.setVisible(true); // ���̱�
		
		
	}

}
