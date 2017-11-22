package oop.test;

public class Main {

	public static void main(String[] args) {
		
		Sample sample = new Sample();
		
		sample.setCurrentSpeed(10);
		System.out.println(sample.getCurrentSpeed());
		
		sample.setCurrentSpeed(-10);
		System.out.println(sample.getCurrentSpeed());
	}
}
