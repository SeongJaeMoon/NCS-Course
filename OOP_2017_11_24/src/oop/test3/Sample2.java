package oop.test3;

public class Sample2 {

	//static final �ʵ� �ʱ�ȭ
	
	/*
	 -static final �ʵ�� static Ư�� + final Ư���� ���ÿ� ������.
	 -�ʵ�� ���(constant)��� ǥ���Ѵ�. ������� ���������� �빮�ڷ� ǥ���Ѵ�. snake ǥ��� ���. '�ܾ�1_�ܾ�2' ���·� ǥ��
	 -����
	 -�ʱ�ȭ�� ����� �ʱ�ȭ, static �ʱ�ȭ ���� ����
	 private static final �ڷ��� ������ = ��;
	 */

	private int a;
	
	//static final �ʵ�
	//->�빮�ڷ� ǥ��
	//->�ڵ� �ʱ�ȭ ���� �Ұ�
	//->getter�� ������ �ʰ�, ���� ���� �����ϵ��� ����
	
	public static final int A = 1;
	public static final int B;
	
	static {
		//static ������ = ��;
		B=10;
	}
	
}
