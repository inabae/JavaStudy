package ch13;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class window {
//	MouseListener m1 = new MouseListener();
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("������");
		
		JButton button = new JButton();
		button.setText("��������");
		button.setBackground(Color.BLACK);
		
		MyMouseListener m1 = new MyMouseListener();
		button.addMouseListener(m1); //��ư ���� ����
		
		button.addMouseListener(new MouseListener() { // �͸� Ŭ����

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		frame.add(button);

		
		frame.setSize(500,500);
//		frame.setResizable(false); //â ũ�⺯�� �Ұ�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class MyMouseListener implements MouseListener{ 

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�ȴ�");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
