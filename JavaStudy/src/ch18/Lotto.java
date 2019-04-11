package ch18;

import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		TreeSet<Integer> my = new TreeSet<Integer>();

		lotto.add(10);
		lotto.add(16);
		lotto.add(20);
		lotto.add(25);
		lotto.add(33);
		lotto.add(37);

		my.add(10);
		my.add(16);
		my.add(20);
		my.add(25);
		my.add(33);
		my.add(37);

		System.out.println(lotto.containsAll(my));// lotto�� my�� ���ؼ� ��ġ�ϸ� true

		int count = 0; //�õ�Ƚ��
		while (true) { // 1�� ��ȣ ���⶧����
			my.clear(); //my�� ���� �ʱ�ȭ
			while (true) { // �� ��ȣ�� 6�� �������������
				int num = (int) (Math.random() * 45 + 1);
				my.add(num);
				if (my.size() == 6)
					break;
			}
			count++;
			boolean isMatch = lotto.containsAll(my);
			if (isMatch)
				break;
		}

		System.out.println("�õ� Ƚ�� : " + count);
	}

}
