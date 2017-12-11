package com.abstraction01;

public class Main{
	
	public static void main(String []args) {
		Television tv = new Television();
		tv.turnOn();
		tv.setVolume(5);
		tv.turnOff();
		tv.setVolume(1);
	}
}
