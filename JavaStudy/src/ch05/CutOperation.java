package ch05;

public class CutOperation {
	public static void main(String[] args) {
		// ??????????????????????????????????????
		int[] stick = { 5, 4, 4, 2, 2, 8 };
		int min = Integer.MAX_VALUE; // int가 가질수있는 가장 큰 값
		int count = 0;

		while (true) {
			// 1.0보다 큰 배열 요소의 개수를 출력
			for (int i = 0; i < stick.length; i++) {
				if (stick[i] > 0) {
					count++;
				}
			}
			System.out.println(count);
			if(count <= 1)
				break;
			
			// 2.배열요소중에서 0을 제외하고 가장 적은 수를 찾기
			for (int i = 0; i < stick.length; i++) {
				if (min > stick[i] && stick[i] > 0) {
					min = stick[i];
				}
			}

//		for (int value : stick) { //for-each
//			System.out.println(value);
//		}

			// 3.가장 적은 수로 모든 배열 요소 값을 감소시키기
			for (int i = 0; i < stick.length; i++) {
				stick[i] -= min;
			}
		}
	}
}
