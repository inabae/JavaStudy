package ch12;

public class Substring {
	public static void main(String[] args) {
		String str = "Java 개발자 양성을 통한 취업연계과정!!";
		
		int idx = 0;
		while(true) {
			idx = str.indexOf(" ", idx + 1);
			if(idx == -1) { 
				System.out.println("전체 : "+str);
				break;
			}
			System.out.println(str.substring(0,idx));
		}
	}

}
