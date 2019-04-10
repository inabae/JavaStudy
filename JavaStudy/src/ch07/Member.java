package ch07;

public class Member {
	String id;
	String pw;
	String name;
	int age;
	
	public void setId(String i) {
		id = i;
	}

	public void setAge(int a) {
		if (a < 0 || a > 100) {
			System.out.println("잘못된 나이입니다.");
			return;
		}
		age = a;
	}
	public int getAge() {
		return age;
	}
}