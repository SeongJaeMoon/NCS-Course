package oop.test3;

public class Sample {
	//final 필드 초기화
			/*
			-final 필드는 final 키워드가 붙은 필드. 멤버(필드, 메소드)의 상태를 변경 불가 상태로 만든다.
			-초기화 이후 변경 불가능한 필드가 된다. 일반 필드는 초기화 이후에도 setter를 이용해서 변경 가능.
			-외부에서 필드 접근시 read-only 상태이므로 getter만 필요
			-초기화는 명시적 초기화, 생성자에 의한 초기화 가능.
			-형식

			private final 자료형 변수명;
			private final 자료형 변수명 = 값;
			*/
			//일반 필드
			//->자동 초기화 지원 가능
			private int a;
			//final 필드
			//->자동 초기화 지원 불가
			private final int b = 10;
			private final int c;
			public Sample() {
				this(10);
			}
			public Sample(int c) {
				this.c = c;
			}
			
			//일반 필드 -> getter(O), setter(O)
			//final 필드 -> getter(O), setter(X)
			public int getA() {
				return this.a;
			}
			public void setA(int a) {
				this.a = a;
			}
			//final 필드 - > setter(X), getter(O) -> read-only
			public int getB() {
				return this.b;
			}
			public int getC() {
				return this.c;
			}
			/*
			 public void setB(int b){
			 	this.b = b; //에러난당!
			 }
			 */
			
}
