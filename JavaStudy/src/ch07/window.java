package ch07;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class window {
	public static void main(String[] args) {
		JFrame frame = new JFrame("윈도우");
		
		JButton button = new JButton();
		button.setText("누르지마");
		button.setBackground(Color.GREEN);
		frame.add(button);

		
		frame.setSize(500,500);
//		frame.setResizable(false); //창 크기변경 불가
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
