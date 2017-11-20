package oop.test;

//�Ű����� �׽�Ʈ�� Ŭ����
public class Sample {
	//�Ű����� 
	//- �޼ҵ� ���࿡ �ʿ��� �ܺ� �����͸� �����ϴ� ����
	//- �޼ҵ� ȣ��� �Ű������� �����ϴ� �����͸� �����ؾ� �Ѵ�.
	
	//�Ű����� ���� ���
	void method() {
		System.out.println("�Ű������� ���� �޼ҵ� ȣ��.");
	}
	//�Ű������� �ִ� ���
	//->�޼ҵ��̸�(�ڷ���, ������, ...)
	//->�ܺ��ڷ�(�̸�, ��ȭ��ȣ)�� ���� ������ �ִ� ���� �ϳ��� �ڷ�(������ ����)�� ������
	void method2(int x, int y){
		//���� �׼� ������ ���� �ܺ� �ڷ�
		//->x, y
		System.out.printf("x:%s%n", x);
		System.out.printf("x:%s%n", y);
	}
	
	int method3(int x, int y) {
		int result = x+y;
		return result;
	}
	
	String decToHex(int dec, int radix) {
		int a = 0;
		StringBuilder result = new StringBuilder();
		String[] temp = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
		if (dec > 0 && radix == 2 || radix == 16) {
			while (true) {
				a = dec % radix;
				dec /= radix;
				result.insert(0, temp[a]);//Ư�� ��ġ�� ���ڿ� �����
				if (dec == 0)
					break;
			}
		} else {
				result.append("Error");//�ڿ� �����
		}
		return result.toString();
	}
}
