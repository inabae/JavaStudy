package ch18;

import java.util.TreeSet;

public class TreeSetExam {
	public static void main(String[] args) {
		// �ߺ��� �ȵǰ� ���ڸ� ������������ ���ĵ�
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		while(true) {
			int num = (int)(Math.random() * 45) +1;
			lotto.add(num);
			if(lotto.size() == 6) {
				break;
			}
		}
		System.out.println(lotto);
		
		//�迭 �⺻ ����
		String[] arr = new String[3];
		arr[0] = "kim";
		String value = arr[0];
        
		//����Ʈ �⺻ ����
		TreeSet<Integer> list2 = new TreeSet<Integer>(); //���� 

		TreeSet<String> list = new TreeSet<String>(); //����
		list.add("bae");
		//String value2 = (String) list.get(0);
	}

}
