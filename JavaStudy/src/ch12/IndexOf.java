package ch12;

public class IndexOf {
	public static void main(String args[]) {
		// 01234 8 12 15
		String str = "Java ������ �缺�� ���� ����������!!";
		int idx = str.indexOf(" "); // ù��° ������ ��ġ
		System.out.println(idx);

		// ������� ���� ã��
		while (true) {
			idx = str.indexOf(" ", idx + 1);
			if (idx == -1) { //indexOf�� Ž���� ���ڿ��� ������ -1�� ��ȯ��.
				break;
			}
			System.out.println(idx);
		}

//		//�ڿ������� ������ ã��
//		int idx2 = str.lastIndexOf(" ");
//		System.out.println("��"+idx2);
//		
//		//ó���� ã�� ������ġ(idx)+1�� �������� ������ ã�ƾ� �ι�° ������ �� �� ����
//		idx = str.indexOf(" ", idx + 1); 
//		System.out.println(idx);
//
//		idx2 = str.lastIndexOf(" ", idx2 - 1);
//		System.out.println(idx2);
//	}
	}
}