package oop.test;

//�Ű����� �׽�Ʈ�� Ŭ����
public class Sample2 {
	
	//�Ű����� ������ ��Ȯ���� ���
	//->��, �ڷ����� Ȯ���� ����
	//->�Ű����� ��Ͽ��� "..."ǥ��.
	//->���� ���� �Ű��� ����� �迭�� ǥ���ȴ�.
	//->�����Ű�����
	void method(int...args) {
		for(int temp : args) {
			System.out.println(temp);
		}
		for(int b = 0; b < args.length; ++b) {
			System.out.printf("a[%d]: %d%n", b, args[b]);
		}
	}
	
	//�Ű����� �ڷ����� ���� ����
	//�⺻��(by value)�� ������(by reference)�� ����
	
	//by value
	//�޼ҵ� ȣ��� �Ű����� ���� �������ʰ� �޴� ���� ���� ���� ����.
	//�� ����
	void method1(int i) {
		++i;
		System.out.printf("inner: %d%n",i);
	}
	
	//by reference
	//�޼ҵ� ȣ��� �Ű����� ���� �������ʰ� �޴� ���� ���� ���� ����.
	//->�����ּ� ����
	//->�޼ҵ� �׼� ����� ���� return ������ �ʿ� ����.
	void method2(int[]a) {
		++a[0];
		System.out.printf("inner arr : %d%n",a[0]);
	}
	
	int method3(int a) {
		++a;
		return a;
	}
}

