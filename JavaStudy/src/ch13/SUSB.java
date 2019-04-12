package ch13;

public class SUSB extends USB {
	public static void main(String[] args) {

		new USB() { // 익명클래스 - 원래 추상클래스는 new가 안되는데 일회용으로 사용할 때 이렇게 사용.
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
