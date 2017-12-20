package com.test007;

//자식 역할 클래스
//부모 클래스가 제네릭 클래스인 경우 자식 클래스도 제네릭 클래스여야 한다.
//단, 타입 파라미터를 확장할 수 있다.
//부모가 제네릭 인터페이스인 경우도 마찬가지로 구현되는 자식 클래스는 제네릭 클래스여야 한다.
public class ChildBox<T, M> extends Box<T> {
	

}
