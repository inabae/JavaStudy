package WeekTest;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Test {
	public static void main(String[] args) {
		JFrame frm = new JFrame("�α��� â");
		JButton btn = new JButton("�α���");
		JPanel panel = new JPanel();
		JLabel idLabel = new JLabel("ID : ", SwingConstants.RIGHT);
		JTextField idText = new JTextField(10);
		JLabel pwLabel = new JLabel("Password : ", SwingConstants.RIGHT);
		JPasswordField pwText = new JPasswordField(10);

		frm.setBounds(100, 100, 400, 180);
		frm.setLayout(new GridLayout(0, 2));
		frm.add(idLabel);
		frm.add(idText);
		frm.add(pwLabel);
		frm.add(pwText);
		panel.add(btn);
		frm.add(panel);

		btn.addMouseListener(new MouseListener() {
			int count = 0;

			public void mouseReleased(MouseEvent e) {
				String idcheck = idText.getText();
				String pwcheck = pwText.getText();

				if (idcheck.equals("")) {
					System.out.println("���̵� �Է����ּ���.");
					idText.setText("");
					pwText.setText("");
					count++;
					System.out.println("�α��ο� " + count + "�� Ʋ�Ƚ��ϴ�.");
				} else if (pwcheck.equals("")) {
					System.out.println("��й�ȣ�� �Է����ּ���.");
					idText.setText("");
					pwText.setText("");
					count++;
					System.out.println("�α��ο� " + count + "�� Ʋ�Ƚ��ϴ�.");
				} else if (idcheck.equals("ai")) {
					if (pwcheck.equals("1234")) {
						System.out.println("ai�� �ݰ����ϴ�.");
						frm.setVisible(false);
					} else {
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
						idText.setText("");
						pwText.setText("");
						count++;
						System.out.println("�α��ο� " + count + "�� Ʋ�Ƚ��ϴ�.");
					}
				} else {
					System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
					idText.setText("");
					pwText.setText("");
					count++;
					System.out.println("�α��ο� " + count + "�� Ʋ�Ƚ��ϴ�.");
				}
				if (count >= 5) {
					System.out.println("ȸ�������� �ٽ� ���ּ���.");
					frm.setVisible(false);
				}
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {}
		});
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
