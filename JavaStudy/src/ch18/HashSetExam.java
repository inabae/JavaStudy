package ch18;

import java.util.HashSet;

public class HashSetExam {
	public static void main(String[] args) {
		// �ߺ��� �Ұ����ؼ� �ߺ��� ���� �ȳ���
		HashSet<Integer> lotto = new HashSet<Integer>();
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
		HashSet<Integer> list2 = new HashSet<Integer>(); //���� 

		HashSet<String> list = new HashSet<String>(); //����
		list.add("bae");
		//String value2 = (String) list.get(0);
	}

}
