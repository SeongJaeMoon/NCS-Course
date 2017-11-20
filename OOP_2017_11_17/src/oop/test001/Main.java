package oop.test001;

public class Main {

	public static void main(String[] args) {
		
		//Car Ŭ������ ���� ��ü ���� -> new������
		//Ŭ������ ������ = new Ŭ������();
		Car myCar = new Car();
		
		//Car ��ü�� ���(�ʵ�) ���� �� �� ��� -> .(dot)������
		System.out.println(myCar.currentSpeed);
		System.out.println(myCar.model);
		
		//�ʵ�� �����̹Ƿ�, ���ο� �� ���� ����
		//-> Car ��ü�� ���¸� ������ �� �ִ�.
		//����) �ʵ�� local ������ �ƴϴ�. instance �����̴�.
		//������.������� = ��;
		//�ʵ�� ��ü ������ �غ�Ǹ�, ��ü �Ҹ�ñ��� Ȱ�� ����.
		myCar.currentSpeed = 30;
		System.out.println(myCar.currentSpeed);
	}
}
