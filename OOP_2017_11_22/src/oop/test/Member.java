package oop.test;

//데이터 모델링 테스트 클래스
public class Member {
	
	//데이터 모델링
	//현실 세계의 자료를 클래스로 표현. 예를 들어, 개인정보(이름, 전화번호, 이메일).
	//->이름, 전화번호, 이메일 항목을 개인정보 클래스로 그룹화.
	//->사용자 정의 자료형인 클래스를 이용하면 원하는대로 구성 가능.
	//->항목 구성은 필드로 한다. private 접근제한자 권장.
	//->필드 당 getter, setter 구성 추가.
	
	private String name;
	private String id;
	private String password;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public String memberInfo() {
		return String.format("[%s %s %s %d]%n",this.name ,this.id ,this.password, this.age);
	}

}
