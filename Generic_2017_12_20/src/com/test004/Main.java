package com.test004;

public class Main {

	public static void main(String[] args) {
		
		//���׸� �޼ҵ� �׽�Ʈ

		//Ÿ�� �Ķ���� �ڷ����� ��������� ������ ���·� ȣ��
		Box<Integer> box1 = Util.<Integer>boxing(100);
		System.out.println(box1.getT());

		//Ÿ�� �Ķ���� �ڷ����� �Ͻ������� ������ ���·� ȣ��
		//->�Ͻ����� ��� �Ű������� ���޵� ���� ���� �ڷ��� �Ǵ�
		Box<Integer> box2 = Util.boxing(200);
		System.out.println(box2.getT());
		
		
		//��Ƽ Ÿ�� �Ķ���� ���׸� �޼ҵ� �׽�Ʈ
		Pair<String, String> pair1 = new Pair<String, String>("A001", "hong"); 
		Pair<String, String> pair2 = new Pair<String, String>("A002", "park");
		//�ڹ�7 ���ĺ��ʹ� ��ü ������ Ÿ�� �Ķ���� ǥ�� ���� ����
		Pair<String, String> pair3 = new Pair<>("A001", "hong");

		//Ÿ�� �Ķ���� �ڷ����� ��������� ������ ���·� ȣ��
		System.out.println(Util.<String, String>compare(pair1, pair2)); //false
		//Ÿ�� �Ķ���� �ڷ����� �Ͻ������� ������ ���·� ȣ��
		System.out.println(Util.compare(pair1, pair3)); //true
				
	}

}