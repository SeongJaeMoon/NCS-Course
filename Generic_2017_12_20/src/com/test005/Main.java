package com.test005;

public class Main {

	public static void main(String[] args) {
		
		//���ѵ� Ÿ�� �Ķ���� <T extends �ֻ���Ÿ��> ���׸� �޼ҵ� �׽�Ʈ
		
		//Number�� ���� �ڷ���(Byte, Short, Integer, Long, Float, Double)�� ����
		Util.<Integer>compare(10, 20); //O
		
		//Number�� ���� �ڷ����� ����
		//Util.<String>compare("10", "20"); //X
		
		//Number�� ���� �ڷ���(Byte, Short, Integer, Long, Float, Double)�� ����
		Box<Integer> box1 = new Box<Integer>(); //O
		box1.setT(10);
		System.out.println(box1.getT());
		
		//Number�� ���� �ڷ����� ����
		/*
		Box<String> box2 = new Box<String>(); //X
		box2.setT("10");
		System.out.println(box2.getT());
		*/
		

	}

}
