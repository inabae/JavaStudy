package ch12;

public class IndexOf2 {
	public static void main(String args[]) {
		String str = "Java ������ �缺�� ���� ����������!!";
		int sidx = 0; // ���� �ε���
		int eidx = 0; // �� �ε���

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