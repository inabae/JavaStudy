package ch18;

import java.util.ArrayList;

public class ArrayListExam {
	public static void main(String[] args) {
		// �����ϴ� ���� �ߺ� ����
		ArrayList<Integer> lotto = new ArrayList<Integer>();
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
		ArrayList<Integer> list2 = new ArrayList<Integer>(); //���� 

		ArrayList<String> list = new ArrayList<String>(); //����
		list.add("bae");
		String value2 = (String) list.get(0);
//		System.out.println(value2);
	}

}
