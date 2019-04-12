package ch15;

public class ExceptionExam1 {
	public static void main(String[] args) {
		String numStr = " 123";
		try {
			// 숫자 문자열을 진짜 숫자로 바꿔줌 - parseInt()
			int num = Integer.parseInt(numStr); // NumberFormatException
		} catch (NumberFormatException e) {
			e.printStackTrace(); // 에러메시지의 발생 근원지를 찾아 단계별로 에러 출력(표시를 해줘야 오류를 알 수 있음)
		} catch (Exception e) { // NumberFormatException말고 다른 Exception이 있을 수 있으니 안전빵으로 마지막에 한번 더 체크해줌
			e.printStackTrace();
		}
		Object obj = new String("a");
		try {
			int a = (Integer) obj; // ClassCastException
		} catch (ClassCastException e) {
			System.out.println("xx에서 오류 발생"); //int a = (Integer) obj;에서 오류가 나면 출력됨
		}
	}
}
