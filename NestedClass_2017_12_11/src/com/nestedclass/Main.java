package com.nestedclass;

public class Main {
	public static void main(String []args) {
		OuterClass outer = new OuterClass();
		outer.method();
		OuterClass.InnerClass2.method1();
	
	}
}
