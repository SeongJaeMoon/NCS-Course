package oop.test001;

//����) toString() �޼ҵ� ����� �����Ѵ�.

//Ŭ���� ���� ������ ��ü ���� ���� �׽�Ʈ
public class Test {
	//main() �޼ҵ�� ���α׷� ����� JVM�� ���� �ڵ� ȣ��ȴ�.
	public static void main(String[]args) {
		
		//��ü ���� ����
		//Ŭ���� ���� = new Ŭ����();
		Test t = new Test();
		
		//��ü ���� Ȯ��
		//��ü ���� �� ������ ���ؼ� ��ü�� ���(�ʵ�, �޼ҵ�)�� ������ �� ��� -> dot(.)������
		System.out.println(t.toString());
		
		//�������� �ʴ� ��� ���ٽ� ����
		//The method test() is undefined for the type Test
		//System.out.println(t.test());
	}
}
