package ch21;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing1 {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		
		j.setLayout(new FlowLayout()); // 설정을 기본값으로 하겠다.ex> 버튼크기,위치 등..
		
		JButton b1 = new JButton("button1");
		JButton b2 = new JButton();
		b2.setText("button2");
		
		j.add(b1);
		j.add(b2);
		
		j.setSize(400,400);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼으로 끄는 기능 구현
		j.setVisible(true); // 보이기
		
		
	}

}
