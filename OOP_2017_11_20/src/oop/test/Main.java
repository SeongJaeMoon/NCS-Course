package oop.test;

public class Main {

	public static void main(String[] args) {
		//�Ű����� �׽�Ʈ�� Ŭ������ ��ü(instance) ����
		//-> new ������
		//-> heap ����
		//-> �����ּҸ� ������ ����(4byte)�� stack ����
		//-> ���� ������ ��� ����� ������ �غ�ǰ�, ���� ��� ������ ����� �Ҹ�. ��ü�� heap �������� ������ ��ü�� �ȴ�. ������ �÷����� ���� ����� �ȴ�.
		Sample s = new Sample();
		//��ü ������ �� ��ü�� ���� ���(�޼ҵ�) �C�� ����
		//->�޼ҵ� ȣ��
		//->����.�޼ҵ��()
		//->�޼ҵ� �ñ״�ó�� �м��ؼ� �Ű������� ��ȯ���� �м��ؾ� �Ѵ�.
		
		//�Ű�����, ��ȯ���� ���� �޼ҵ� ȣ��
		//->����.�޼ҵ��()
		//->�޼ҵ� �ñ״�ó->void method()
		//->�޼ҵ� ���� ��ġ �̵��� Ctrl + �޼ҵ��̸� Ŭ��
		s.method();
		
		//�Ű������� �ִ�, ��ȯ���� ���� �޼ҵ� ȣ��
		//->�޼ҵ� �ñ״�ó->void method2(int x, int y)
		//->����.�޼ҵ��(��1, ��2)
		//->�����ϴ� ���� �Ű������� �ڷ���, ����, ������ ���缭 �����ؾ� �Ѵ�.
		s.method2(10, 20);
		
		//�Ű�����, ��ȯ ���� �ִ� �޼ҵ� ȣ��
		//->�޼ҵ� �ñ״�ó->int method3(int x, int y);
		//->�ڷ��� ���� = ����.�޼ҵ��(��1, ��2);
		//->�����ϴ� ���� �Ű������� �ڷ���, ����, ������ ���缭 �����ؾ� �Ѵ�.
		int result = s.method3(10, 20);
		System.out.println(result);
		System.out.println(s.method3(10, 20));
		
		double result2 = s.method3(10, 20);//�ڵ� ����ȯ ����
		
		//���� ��ȯ �޼ҵ� ȣ�� �׽�Ʈ
		//�޼ҵ� �ñ״�ó �м� -> String toBin(int dec)
		//String ���� = toBin(��);
		int a = 10;
		Capsulation cap = new Capsulation();	
		System.out.printf("%d(10) -> %s(2)%n", a,cap.decToBin(10));
		//�ڹٿ��� �����ϴ� ���� ��ȯ �޼ҵ�
		String result3 = Integer.toString(a, 2);
		System.out.printf("%d(10) -> %s(2)%n", a, result3);
		
		//�ڹٿ��� �����ϴ� ���� ��ȯ �޼ҵ�
		String result4 = Integer.toString(a, 16);
		System.out.printf("%d(10) -> %s(16)%n", a, result4);
		
		Sample sample = new Sample();
		int i = 110;
		System.out.printf("%d(10)->%s(16)%n", i, sample.decToHex(i, 16));
		i = 220;
		System.out.printf("%d(10)->%s(16)%n", i, sample.decToHex(i, 16));
		i = 10;
		System.out.printf("%d(10)->%s(16)%n", i, sample.decToHex(i, 16));
		
		//�����Ű������� ���� �� ����
		Sample2 sample2 = new Sample2();
		//�����ؾ� �ϴ� ���� ������ ������ ����.
		sample2.method();
		sample2.method(10, 20, 30);
		sample2.method(30, 40, 50, 60);
		//�迭 ��ü�� ������ �� �ִ�.
		int[]arr = { 10, 20, 30, 40};
		sample2.method(arr);

	}
}
