package ch15;

public class ExceptionExam1 {
	public static void main(String[] args) {
		String numStr = " 123";
		try {
			// ���� ���ڿ��� ��¥ ���ڷ� �ٲ��� - parseInt()
			int num = Integer.parseInt(numStr); // NumberFormatException
		} catch (NumberFormatException e) {
			e.printStackTrace(); // �����޽����� �߻� �ٿ����� ã�� �ܰ躰�� ���� ���(ǥ�ø� ����� ������ �� �� ����)
		} catch (Exception e) { // NumberFormatException���� �ٸ� Exception�� ���� �� ������ ���������� �������� �ѹ� �� üũ����
			e.printStackTrace();
		}
		Object obj = new String("a");
		try {
			int a = (Integer) obj; // ClassCastException
		} catch (ClassCastException e) {
			System.out.println("xx���� ���� �߻�"); //int a = (Integer) obj;���� ������ ���� ��µ�
		}
	}
}
