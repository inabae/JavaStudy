package ch21;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing2 {
	public static void main(String[] args) {
		JFrame j = new JFrame();

		j.setLayout(new FlowLayout()); // 설정을 기본값으로 하겠다.ex> 버튼크기,위치 등..

		MouseListener m1 = new MouseListener() {
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {
				JButton b = (JButton) e.getSource(); // e.getSource() 눌리는 버튼을 체크
				String text = b.getText();
				System.out.println(text); // button1 버튼의 이름text를 출력하는 방법
			}
		};

		JButton b1 = new JButton("button1");
		b1.addMouseListener(m1);
		JButton b2 = new JButton();
		b2.setText("button2");
		b2.addMouseListener(m1);

		j.add(b1);
		j.add(b2);

		j.setSize(400, 400);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼으로 끄는 기능 구현
		j.setVisible(true); // 보이기

	}

}
