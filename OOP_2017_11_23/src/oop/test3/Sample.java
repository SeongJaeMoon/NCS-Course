package oop.test3;

public class Sample {
	
	/*
	//�̱��� ����
	- Gof ������ ������ �� ����
	- ��������, ���� ����, ���� ����...etc 
	- �� Ŭ������ �� ��ü�� ����(����)�ϵ��� �����Ѵ�.
	- ����ڰ� ���� ��ü ���� �䱸�ϴ� ��Ȳ ����(private ������) + ��ü ���� �䱸�� ó���ϴ� ���� �޼ҵ� �߰�
	*/
	
	//����(static) �ʵ�
	//->�ʱⰪ���� ��ü ������ ��� (�����ּ�)
	//->�޸𸮿� Sample ��ü(instance)�� �� ���� ���¸� ����
	private static Sample singleton = new Sample(); 

	//private ������
	private Sample() {
	}
	
	//����(static)�޼ҵ�
	//��ü ���� �䱸�� ó���ϴ� ���� �޼ҵ�
	public static Sample getInstance() {
		//Sample ��ü�� ���� �����ּ� ��ȯ
		//->new �����ڿ� ���� �߰� ��ü ������ ����.
		return singleton;
	}
	
}
