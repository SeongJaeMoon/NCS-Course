package com.polymorphism3;

public class SubClass extends SuperClass {
	
	private Number[]arr = new Number[5];
	private int idx;
	public void add(Number n) {
		arr[this.idx] = n;
		++this.idx;
	}
	public String list(){
		//[°ª, °ª2, ...]
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(Number a : arr) {
			if(a==null)continue;
			sb.append(String.format(" %s ", a));
		}
		sb.append("]");
		return sb.toString();
	}
}
