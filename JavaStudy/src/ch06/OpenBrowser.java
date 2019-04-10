package ch06;

//shift ctrl o => �����س������� import�� �ѹ��� ����
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenBrowser {
	public static void open(String url) {
		// ������ ���� �ڵ�
		try {
			Desktop.getDesktop().browse(new URI(url));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		open("http://www.naver.com");
	}

}
