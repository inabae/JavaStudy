package ch12;

public class Exam12_5 {
	public static void main(String[] args) {
		String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		int sidx = 0;
		int eidx = 0;

		while (true) {
			eidx = str.indexOf(" ", sidx + 1);
			if (eidx == -1) {
				System.out.println("전체 : " + str);
				break;
			}
			System.out.println(str.substring(sidx, eidx));
			sidx = eidx;
		}
	}

}
