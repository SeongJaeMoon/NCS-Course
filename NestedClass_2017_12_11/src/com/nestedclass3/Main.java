package com.nestedclass3;

public class Main {

	public static void main(String[] args) {
		Anoymous anony = new Anoymous();
		anony.method2(new Vehicle(){
			@Override
			public void run() {
				
			}
		});
	}
}
