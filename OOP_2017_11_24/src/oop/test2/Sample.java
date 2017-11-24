package oop.test2;

public class Sample {
	/*
	  instance 멤버 -> instance 멤버 (가능) 이 경우만 this 키워드 사용 가능
	  static 멤버 -> static 멤버 (가능)
	  instance멤버 -> static멤버 (제한적 가능)
	  
	  static멤버 -> instance 멤버 (불가능)
	*/
	
	//instance 필드
	private int ins;
	//static 필드
	private static int staticIns;
	//instance 메소드
	
	public void methodInstance() {
		//instance 멤버 -> instance 멤버 (가능) 이 경우만 this 키워드 사용 가능
		System.out.println(this.ins);
		System.out.println(Sample.staticIns);
	}
	
	//static 메소드
	public static void methodStatic() {
		 //static 멤버 -> static 멤버 (가능). this 키워드 사용 불가. 클래스명 사용.
		System.out.println(Sample.staticIns);
		 //->메모리 적재 순서가 다르기 때문이다.
		 //static멤버 -> instance 멤버 (불가능)
	}

}
