package ch02;

public class Remain {
	public static void main(String[] args) {
		
		// �� �ڸ����� �� ���ϱ�
		int num = 123;
		int n1 = num % 10; //n1=3
	    num /= 10; //12
	    int n2 = num % 10; //n2=2
	    num /= 10; //1
	    int n3 = num % 10; //n3=1
	    System.out.println(n1 + n2 + n3);
	}

}
