package com.test002;

//자료형 클래스 -> VO, DTO 클래스
public class Member {

	//삭제 기능을 위한 유니크 자료 저장용 항목 추가 -> 번호
	//필드 구성
	private static int count;
	private int mid;
	private String name;
	private String phone;
	
	
	//기본 생성자 추가
	//매개변수가 있는 생성자 추가
	public Member() {}
	
	public Member(String name, String phone) {
		this.mid = ++count;
		this.name = name;
		this.phone = phone;
	}
	
	//getter,setter 추가
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int getMid() {
		return mid;
	}
	
	public void setMid(int mid) {
		this.mid = mid;
	}
	
	@Override
	public String toString() {
		return String.format("%2d %2s %2s", this.mid ,this.name, this.phone);
	}

	//컬렉션 저장소에서 삭제 기준을 제시하기 위한 오버라이딩 구현
	//Object 클래스에서 equals() 메소드 참조 주소 비교
	//Member 클래스에서는 equals() 메소드가 이름 항목 비교
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Member) {
			Member member = (Member)obj;
			result = this.mid == member.getMid();
		}
		return result;
	}
}
