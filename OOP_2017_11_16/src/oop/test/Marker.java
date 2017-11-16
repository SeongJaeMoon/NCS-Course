package oop.test;

//���帶ī�� ���� ��ü �м� �� Ŭ���� ǥ��
public class Marker {

	//���帶ī�� ���� ��ü �м�
	//state - color(����)
	//behavior - writing(����)
	//->fields, Method�� ǥ��
	
	//field ����
	//�ڵ��ʱ�ȭ ����
	//��ü�� ���� ���� ����
	private String color;

	//������ ����
	//��ü ������ field�� ���� �ʱ�ȭ ����
	//->Marker ��ü ������ ���� ���� ����
	//��ü�� �ʱ�ȭ
	public Marker(String color) {
		this.color = color;
	}
	
	public void writing(String color) {
		System.out.printf("(%s) %s%n", this.color, color);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}
