package com.abstraction01;

public class Television implements RemoteControl{
	private int volume;
	private int turn;
	
	@Override 
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
		this.turn = 1;
	}
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
		this.turn = 0;
	}
	@Override
	public void setVolume(int volume) {
		//TV ���� ���� �׼� �߰�
		//����)�ִ�(MAX_VOLUME), �ּ� ����(MIN_VOLUME) ������ ����� �ʵ��� ����
		if(this.turn == 1) {
			if (RemoteControl.MAX_VOLUME < volume) {
				this.volume = RemoteControl.MAX_VOLUME;
			} else if (RemoteControl.MIN_VOLUME > volume) {
				this.volume = RemoteControl.MIN_VOLUME;
			} else {
				this.volume = volume;
			}
			System.out.printf("���� TV ������ %d�Դϴ�%n", this.volume);
		}
	}
}
