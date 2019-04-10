package ch06;

//shift ctrl o => 지정해놓지않은 import를 한번에 해줌
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenBrowser {
	public static void open(String url) {
		// 브라우저 띄우는 코드
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
