package ch07;

public class MemberMain {
	public static void main(String[] args) {
		Member m = new Member();
//		m.id = "bia";
//		m.pw = "1234";
//		m.age = 96;
		
		m.setAge(120);
		System.out.println(m);
		System.out.println(m.id);
	}
}