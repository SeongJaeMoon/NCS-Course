package oop.test;

public class OOP001 {
	public static void main(String[] args) {
			
		//�غ�� Ŭ������ ���� �޸� ����
		//->��ü ����
		//->������ ��ü�� instance�� �Ǵ�.
		//->��� ������ ����
		//->new Ű����
		//Ŭ�����̸� ���� = new Ŭ�����̸�();
		
		//������ ĥ��(�ܼ�)�� ���帶ī ��ü�� �̿��ؼ� �۾��� ������ �Ѵ�.
		//->�޼ҵ� ȣ��
		//->����.�޼ҵ��();
		Marker marker = new Marker("black");
		marker.writing("Hello World!");
		marker.setColor("Yellow");
		marker.writing("Hello World!");
		
		//�ϳ��� Ŭ����(Blueprint)�� ������ �������� ��ü(instance) ���� ����
		//->�ൿ Ư��, ���� Ư���� �����ϴ�.
		System.out.println(marker.getColor());
	}
}
