package ch13;

public class SUSB extends USB {
	public static void main(String[] args) {

		new USB() { // �͸�Ŭ���� - ���� �߻�Ŭ������ new�� �ȵǴµ� ��ȸ������ ����� �� �̷��� ���.
			@Override
			public void connect() {
				// TODO Auto-generated method stub
			}
		};
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub

	}
}
