package ch21;

import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.json.JSONArray;
import org.json.JSONObject;

//네트워크와 버튼 결합 & Browser 띄우기
public class Swing3 {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://dapi.kakao.com/v2/search/image?query=java");
			URLConnection con = url.openConnection();
			con.addRequestProperty("Authorization", "KakaoAK 0a7c5408897da72ef62213f279237f86");
			
			//네트워크 접속
			InputStream in = con.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader reader = new BufferedReader(isr);
			String result = "";
			while(true) {
				String data = reader.readLine();
				if(data == null) break;
				result += data;
			}
			
			// json 파싱
			JSONObject obj = new JSONObject(result);
			JSONArray documents = obj.getJSONArray("documents");
			
			JFrame j = new JFrame();
			j.setLayout(new FlowLayout()); // 설정을 기본값으로 하겠다.ex> 버튼크기,위치 등..
			
			MouseListener m1 = new MouseListener() {
				public void mouseClicked(MouseEvent e) {
					JButton btn = (JButton)e.getComponent();
					String text = btn.getText();
					
					try {
						Desktop.getDesktop().browse(new URI(text));
					} catch (IOException ee) {
						ee.printStackTrace();
					} catch (URISyntaxException ee) {
						ee.printStackTrace();
					}
				}
				public void mouseEntered(MouseEvent e) {}
				public void mouseExited(MouseEvent e) {}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
			};
			
			JPanel panel = new JPanel();
			panel.setLayout(new GridLayout(0,1));
			for (int i = 0; i < documents.length(); i++) {
				JSONObject doc = documents.getJSONObject(i);
				String image_url = doc.getString("image_url");
				System.out.println(image_url);
				
				JButton b1 = new JButton(image_url);
				panel.add(b1);
				b1.addMouseListener(m1);
			}
			JScrollPane jp = new JScrollPane(panel);
			j.add(jp);
			j.setSize(500,300);
			j.setVisible(true);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
