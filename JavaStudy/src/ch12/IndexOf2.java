package ch12;

public class IndexOf2 {
	public static void main(String args[]) {
		String str = "Java 개발자 양성을 통한 취업연계과정!!";
		int sidx = 0; // 시작 인덱스
		int eidx = 0; // 끝 인덱스

		while (true) {
			eidx = str.indexOf(" ", sidx + 1);
			if (eidx == -1) {
				break;
			}
			System.out.println(sidx + ", " + eidx);
			sidx = eidx;
		}
	}
}