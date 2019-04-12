package ch18;

import java.util.ArrayList;

public class ArrayListExam {
	public static void main(String[] args) {
		// 저장하는 값이 중복 가능
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		while(true) {
			int num = (int)(Math.random() * 45) +1;
			lotto.add(num);
			if(lotto.size() == 6) {
				break;
			}
		}
		System.out.println(lotto);
		
		//배열 기본 문법
		String[] arr = new String[3];
		arr[0] = "kim";
		String value = arr[0];
        
		//리스트 기본 문법
		ArrayList<Integer> list2 = new ArrayList<Integer>(); //정수 

		ArrayList<String> list = new ArrayList<String>(); //문자
		list.add("bae");
		String value2 = (String) list.get(0);
//		System.out.println(value2);
	}

}
