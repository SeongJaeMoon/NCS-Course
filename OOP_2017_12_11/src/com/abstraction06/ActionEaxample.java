package com.abstraction06;

public class ActionEaxample {

	public static void main(String[] args) {
		//�͸� ���� ��ü
		//�������̽��� �̿��� �ӽ� ��ü ���� -> �������̽��� �߻� �޼ҵ� �������̵�
		Action action = new Action() {
			@Override
			public void action() {
				System.out.println("���縦 �մϴ�");
			}
		};
		action.action();
	}

}
