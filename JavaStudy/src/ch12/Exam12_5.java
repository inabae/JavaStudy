package ch12;

public class Exam12_5 {
	public static void main(String[] args) {
		String str = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";
		int sidx = 0;
		int eidx = 0;

		while (true) {
			eidx = str.indexOf(" ", sidx + 1);
			if (eidx == -1) {
				System.out.println("��ü : " + str);
				break;
			}
			System.out.println(str.substring(sidx, eidx));
			sidx = eidx;
		}
	}

}
