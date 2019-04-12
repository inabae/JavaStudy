package ch21;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing2 {
	public static void main(String[] args) {
		JFrame j = new JFrame();

		j.setLayout(new FlowLayout()); // ������ �⺻������ �ϰڴ�.ex> ��ưũ��,��ġ ��..

		MouseListener m1 = new MouseListener() {
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {
				JButton b = (JButton) e.getSource(); // e.getSource() ������ ��ư�� üũ
				String text = b.getText();
				System.out.println(text); // button1 ��ư�� �̸�text�� ����ϴ� ���
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
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư���� ���� ��� ����
		j.setVisible(true); // ���̱�

	}

}
