package oop.test;

//보드마카에 대한 객체 분석 및 클래스 표현
public class Marker {

	//보드마카에 대한 객체 분석
	//state - color(색상)
	//behavior - writing(쓰기)
	//->fields, Method로 표현
	
	//field 선언
	//자동초기화 지원
	//객체의 상태 정보 저장
	private String color;

	//생성자 선언
	//객체 생성시 field에 대한 초기화 역할
	//->Marker 객체 생성시 색상 정보 제공
	//객체의 초기화
	public Marker(String color) {
		this.color = color;
	}
	
	public void writing(String color) {
		System.out.printf("(%s) %s%n", this.color, color);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}
