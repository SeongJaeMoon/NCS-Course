package oop.test;

public class Main3 {
	
	//�ν��Ͻ� �޼ҵ� ����
	void method() {
		
	}
	//��ǥ���� static(����)�޼ҵ�
	public static void main(String[] args) {
		
		//�ν��Ͻ� �޼ҵ� ������ ���� this Ű���� ���
		//Cannot use this int a static context
		//this.method();
		
		//-> Main Ŭ������ ���� ��ü(instance)���� �ʿ�
		//-> ���������� ���� ����
		Main3 m = new Main3();
		m.method();
	}
}
