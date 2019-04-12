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
		JFrame frm = new JFrame("로그인 창");
		JButton btn = new JButton("로그인");
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
					System.out.println("아이디를 입력해주세요.");
					idText.setText("");
					pwText.setText("");
					count++;
					System.out.println("로그인에 " + count + "번 틀렸습니다.");
				} else if (pwcheck.equals("")) {
					System.out.println("비밀번호를 입력해주세요.");
					idText.setText("");
					pwText.setText("");
					count++;
					System.out.println("로그인에 " + count + "번 틀렸습니다.");
				} else if (idcheck.equals("ai")) {
					if (pwcheck.equals("1234")) {
						System.out.println("ai님 반갑습니다.");
						frm.setVisible(false);
					} else {
						System.out.println("비밀번호가 틀렸습니다.");
						idText.setText("");
						pwText.setText("");
						count++;
						System.out.println("로그인에 " + count + "번 틀렸습니다.");
					}
				} else {
					System.out.println("아이디가 틀렸습니다.");
					idText.setText("");
					pwText.setText("");
					count++;
					System.out.println("로그인에 " + count + "번 틀렸습니다.");
				}
				if (count >= 5) {
					System.out.println("회원가입을 다시 해주세요.");
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
