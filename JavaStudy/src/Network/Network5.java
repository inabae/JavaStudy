package Network;

import com.ggoreb.kakao_api.TranslateUtil;
import com.ggoreb.kakao_api.VisionUtil;

public class Network5 {
	public static void main(String[] args) {
		TranslateUtil tu = new TranslateUtil("0a7c5408897da72ef62213f279237f86");
		String r = tu.sendText("kr", "jp", "안녕하세요.");
		System.out.println(r);
		
		// 얼굴 분석 ggoreb.jar사용
//		VisionUtil vu = new VisionUtil("0a7c5408897da72ef62213f279237f86");
//		String result = vu.sendFile("c:/dev/c.jpg"); // 해당이미지파일을 불러옴
//		System.out.println(result);
	}
}
