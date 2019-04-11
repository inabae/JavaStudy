package ch18;

import java.util.TreeSet;

public class TreeSetExam {
	public static void main(String[] args) {
		// 중복도 안되고 숫자를 오름차순으로 정렬됨
		TreeSet<Integer> lotto = new TreeSet<Integer>();
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
		TreeSet<Integer> list2 = new TreeSet<Integer>(); //정수 

		TreeSet<String> list = new TreeSet<String>(); //문자
		list.add("bae");
		//String value2 = (String) list.get(0);
	}

}
