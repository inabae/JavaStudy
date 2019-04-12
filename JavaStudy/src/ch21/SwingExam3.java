package ch21;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SwingExam3 {
	public static void main(String[] args) {
		JFrame frm = new JFrame("모양만 계산기");
		frm.setBounds(100, 100, 220, 300);
		frm.setLayout(new BorderLayout());

		JLabel label = new JLabel();
		label.setText(" ");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		frm.add(label, BorderLayout.NORTH);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();

		panel1.setLayout(new GridLayout(3, 3));
		panel2.setLayout(new GridLayout(1, 4));
		
		MouseListener m1 = new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				JButton btn = (JButton)e.getComponent();
				String text = btn.getText();
				label.setText(label.getText() + text);
			}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			};
		
		for (int i = 9; i >= 1; i--) {
			JButton btn = new JButton(i + "");
			btn.addMouseListener(m1);
			panel1.add(btn); // +"" => int형을 문자열로 바꿔줌!!!!!!
		}

		panel2.add(new JButton("+"));
		panel2.add(new JButton("-"));
		panel2.add(new JButton("x"));
		panel2.add(new JButton("/"));
		
		frm.add(panel1, BorderLayout.CENTER);
		frm.add(panel2, BorderLayout.SOUTH);

		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
