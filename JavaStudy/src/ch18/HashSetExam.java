package ch18;

import java.util.HashSet;

public class HashSetExam {
	public static void main(String[] args) {
		// 중복이 불가능해서 중복된 값이 안나옴
		HashSet<Integer> lotto = new HashSet<Integer>();
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
		HashSet<Integer> list2 = new HashSet<Integer>(); //정수 

		HashSet<String> list = new HashSet<String>(); //문자
		list.add("bae");
		//String value2 = (String) list.get(0);
	}

}
