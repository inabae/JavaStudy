package ch05;

public class CutOperation {
	public static void main(String[] args) {
		// ??????????????????????????????????????
		int[] stick = { 5, 4, 4, 2, 2, 8 };
		int min = Integer.MAX_VALUE; // int�� �������ִ� ���� ū ��
		int count = 0;

		while (true) {
			// 1.0���� ū �迭 ����� ������ ���
			for (int i = 0; i < stick.length; i++) {
				if (stick[i] > 0) {
					count++;
				}
			}
			System.out.println(count);
			if(count <= 1)
				break;
			
			// 2.�迭����߿��� 0�� �����ϰ� ���� ���� ���� ã��
			for (int i = 0; i < stick.length; i++) {
				if (min > stick[i] && stick[i] > 0) {
					min = stick[i];
				}
			}

//		for (int value : stick) { //for-each
//			System.out.println(value);
//		}

			// 3.���� ���� ���� ��� �迭 ��� ���� ���ҽ�Ű��
			for (int i = 0; i < stick.length; i++) {
				stick[i] -= min;
			}
		}
	}
}
