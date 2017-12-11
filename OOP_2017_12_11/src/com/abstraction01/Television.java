package com.abstraction01;

public class Television implements RemoteControl{
	private int volume;
	private int turn;
	
	@Override 
	public void turnOn() {
		System.out.println("TV를 켭니당");
		this.turn = 1;
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니당");
		this.turn = 0;
	}
	@Override
	public void setVolume(int volume) {
		//TV 볼륨 조절 액션 추가
		//주의)최대(MAX_VOLUME), 최소 볼륨(MIN_VOLUME) 범위를 벗어나지 않도록 설정
		if(this.turn == 1) {
			if (RemoteControl.MAX_VOLUME < volume) {
				this.volume = RemoteControl.MAX_VOLUME;
			} else if (RemoteControl.MIN_VOLUME > volume) {
				this.volume = RemoteControl.MIN_VOLUME;
			} else {
				this.volume = volume;
			}
			System.out.printf("현재 TV 볼륨은 %d입니당%n", this.volume);
		}
	}
}
