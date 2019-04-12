package ch12;

public class IndexOf {
	public static void main(String args[]) {
		// 01234 8 12 15
		String str = "Java 개발자 양성을 통한 취업연계과정!!";
		int idx = str.indexOf(" "); // 첫번째 공백의 위치
		System.out.println(idx);

		// 순서대로 공백 찾기
		while (true) {
			idx = str.indexOf(" ", idx + 1);
			if (idx == -1) { //indexOf는 탐색할 문자열이 없으면 -1을 반환함.
				break;
			}
			System.out.println(idx);
		}

//		//뒤에서부터 공백을 찾음
//		int idx2 = str.lastIndexOf(" ");
//		System.out.println("ㅣ"+idx2);
//		
//		//처음에 찾은 공백위치(idx)+1을 시작으로 공백을 찾아야 두번째 공백을 알 수 있음
//		idx = str.indexOf(" ", idx + 1); 
//		System.out.println(idx);
//
//		idx2 = str.lastIndexOf(" ", idx2 - 1);
//		System.out.println(idx2);
//	}
	}
}